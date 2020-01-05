# Missed Coverage Examples

## 1

Superclass:
**AbstractMultipleLinearRegression**

Sibling Classes:
1. **GLSMultipleLinearRegression**
2. **OLSMultipleLinearRegression**

Method not tested:
*calculateErrorVariance()* in **GLSMultipleLinearRegression**

Note: This one is not really a candidate as *calculateErrorVariance()* is not implemented in **OLSMultipleLinearRegression**


```{java}

    // Original implementation in AbstractMultipleLinearRegression
    protected double calculateErrorVariance() {
        RealVector residuals = calculateResiduals();
        return residuals.dotProduct(residuals) /
               (xMatrix.getRowDimension() - xMatrix.getColumnDimension());
    }

    // Implementation in GLSMultipleLinearRegression
    @Override
    protected double calculateErrorVariance() {
        RealVector residuals = calculateResiduals();
        double t = residuals.dotProduct(getOmegaInverse().operate(residuals));
        return t / (getX().getRowDimension() - getX().getColumnDimension());
    }
    
    
    // Test of the original implementation
    protected void checkVarianceConsistency(OLSMultipleLinearRegression model) {
        // Check Y variance consistency
        TestUtils.assertEquals(StatUtils.variance(model.getY().toArray()), model.calculateYVariance(), 0);

        // Check residual variance consistency
        double[] residuals = model.calculateResiduals().toArray();
        RealMatrix X = model.getX();
        TestUtils.assertEquals(
                StatUtils.variance(model.calculateResiduals().toArray()) * (residuals.length - 1),
                model.calculateErrorVariance() * (X.getRowDimension() - X.getColumnDimension()), 1E-20);

    }
```

## 2

Superclass:
**BaseMultivariateMultiStartOptimizer**

Sibling Classes:
1. **DifferentiableMultivariateMultiStartOptimizer**
2. **MultivariateDifferentiableMultiStartOptimizer**
3. **MultivariateMultiStartOptimizer**

Method not tested:
Constructor in **DifferentiableMultivariateMultiStartOptimizer**. (The other two constructors are tested accordingly)

```{java}
// Constructor in the superclass
    protected BaseMultivariateMultiStartOptimizer(final BaseMultivariateOptimizer<FUNC> optimizer,
                                                      final int starts,
                                                      final RandomVectorGenerator generator) {
        if (optimizer == null ||
            generator == null) {
            throw new NullArgumentException();
        }
        if (starts < 1) {
            throw new NotStrictlyPositiveException(starts);
        }

        this.optimizer = optimizer;
        this.starts = starts;
        this.generator = generator;
    }

// Constructor in DifferentiableMultivariateMultiStartOptimizer - not tested
    public DifferentiableMultivariateMultiStartOptimizer(final DifferentiableMultivariateOptimizer optimizer,
                                                         final int starts,
                                                         final RandomVectorGenerator generator) {
        super(optimizer, starts, generator);
    }

// Constructor in MultivariateDifferentiableMultiStartOptimizer - tested
    public MultivariateDifferentiableMultiStartOptimizer(final MultivariateDifferentiableOptimizer optimizer,
                                                         final int starts,
                                                         final RandomVectorGenerator generator) {
        super(optimizer, starts, generator);
    }

// Constructor in MultivariateMultiStartOptimizer - tested
    public MultivariateMultiStartOptimizer(final MultivariateOptimizer optimizer,
                                               final int starts,
                                               final RandomVectorGenerator generator) {
        super(optimizer, starts, generator);
    }


```


