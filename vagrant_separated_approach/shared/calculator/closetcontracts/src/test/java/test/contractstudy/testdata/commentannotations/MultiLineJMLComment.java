package test.contractstudy.testdata.commentannotations;

/** Return the sum of the argument array. */
/*@   old \bigint sum =
  @		(\sum int j; 0 <= j && j < a.length; (\bigint)a[j]);
  @   requires Long.MIN_VALUE <= sum && sum <= Long.MAX_VALUE;
  @   assignable \nothing;
  @   ensures \result == sum;
  @*/

public class MultiLineJMLComment {
}
