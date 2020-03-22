# command to use: find . -type f -print | xargs grep "doOpenIfChanged"

## methods directly called

## google guava (guava/guava):
/home/daveroar/.m2/repository/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar:/home/daveroar/.m2/repository/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar:/home/daveroar/.m2/repository/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar:/home/daveroar/.m2/repository/org/checkerframework/checker-qual/2.8.1/checker-qual-2.8.1.jar:/home/daveroar/.m2/repository/com/google/errorprone/error_prone_annotations/2.3.2/error_prone_annotations-2.3.2.jar:/home/daveroar/.m2/repository/com/google/j2objc/j2objc-annotations/1.3/j2objc-annotations-1.3.jar:/home/daveroar/.m2/repository/org/codehaus/mojo/animal-sniffer-annotations/1.17/animal-sniffer-annotations-1.17.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/guava/guava/target/classes/:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar

### Candidate class name: com.google.common.graph.AbstractValueGraph, method name: hasEdgeConnecting
$ find . -type f -print | xargs grep -n "hasEdgeConnecting("
./google/common/graph/AbstractGraphTest.java:165:        assertThat(graph.hasEdgeConnecting(predecessor, node)).isTrue();
./google/common/graph/AbstractGraphTest.java:172:        assertThat(graph.hasEdgeConnecting(node, successor)).isTrue();
./google/common/graph/AbstractGraphTest.java:178:          assertThat(graph.hasEdgeConnecting(endpoints.source(), endpoints.target())).isTrue();
./google/common/graph/AbstractGraphTest.java:180:          assertThat(graph.hasEdgeConnecting(endpoints.nodeU(), endpoints.nodeV())).isTrue();
./google/common/graph/ValueGraphTest.java:61:        boolean hasEdge = graph.hasEdgeConnecting(node, otherNode);
./google/common/graph/ValueGraphTest.java:62:        assertThat(hasEdge).isEqualTo(asGraph.hasEdgeConnecting(node, otherNode));
./google/common/graph/ValueGraphTest.java:122:    assertThat(graph.hasEdgeConnecting(EndpointPair.ordered(1, 2))).isTrue();
./google/common/graph/ValueGraphTest.java:129:    assertThat(graph.hasEdgeConnecting(EndpointPair.ordered(2, 1))).isFalse();
./google/common/graph/ValueGraphTest.java:136:    assertThat(graph.hasEdgeConnecting(EndpointPair.unordered(1, 2))).isFalse();
./google/common/graph/ValueGraphTest.java:137:    assertThat(graph.hasEdgeConnecting(EndpointPair.unordered(2, 1))).isFalse();
./google/common/graph/ValueGraphTest.java:144:    assertThat(graph.hasEdgeConnecting(EndpointPair.unordered(1, 2))).isTrue();
./google/common/graph/ValueGraphTest.java:151:    assertThat(graph.hasEdgeConnecting(EndpointPair.unordered(2, 1))).isTrue();
./google/common/graph/ValueGraphTest.java:158:    assertThat(graph.hasEdgeConnecting(EndpointPair.ordered(1, 2))).isTrue();
./google/common/graph/ValueGraphTest.java:159:    assertThat(graph.hasEdgeConnecting(EndpointPair.ordered(2, 1))).isTrue();
./google/common/graph/AbstractNetworkTest.java:230:            assertThat(network.hasEdgeConnecting(node, otherNode)).isFalse();
./google/common/graph/AbstractNetworkTest.java:236:            assertThat(network.hasEdgeConnecting(node, otherNode)).isTrue();
./google/common/graph/AbstractNetworkTest.java:239:            assertThat(network.hasEdgeConnecting(node, otherNode)).isTrue();
./google/common/graph/AbstractDirectedGraphTest.java:76:    assertThat(graph.hasEdgeConnecting(EndpointPair.ordered(N1, N2))).isTrue();
./google/common/graph/AbstractDirectedGraphTest.java:82:    assertThat(graph.hasEdgeConnecting(EndpointPair.ordered(N2, N1))).isFalse();
./google/common/graph/AbstractDirectedGraphTest.java:88:    assertThat(graph.hasEdgeConnecting(EndpointPair.unordered(N1, N2))).isFalse();
./google/common/graph/AbstractDirectedGraphTest.java:89:    assertThat(graph.hasEdgeConnecting(EndpointPair.unordered(N2, N1))).isFalse();
./google/common/graph/AbstractUndirectedGraphTest.java:83:    assertThat(graph.hasEdgeConnecting(EndpointPair.unordered(N1, N2))).isTrue();
./google/common/graph/AbstractUndirectedGraphTest.java:84:    assertThat(graph.hasEdgeConnecting(EndpointPair.unordered(N2, N1))).isTrue();
./google/common/graph/AbstractUndirectedGraphTest.java:90:    assertThat(graph.hasEdgeConnecting(EndpointPair.ordered(N1, N2))).isTrue();
./google/common/graph/AbstractUndirectedGraphTest.java:91:    assertThat(graph.hasEdgeConnecting(EndpointPair.ordered(N2, N1))).isTrue();

### Candidate class name: com.google.common.collect.ContiguousSet, method name: range
./google/common/collect/ContiguousSetTest.java:298:    assertEquals(Range.closed(1, 3), ContiguousSet.create(Range.closed(1, 3), integers()).range());
./google/common/collect/ContiguousSetTest.java:299:    assertEquals(Range.closed(1, 3), ContiguousSet.closed(1, 3).range());
./google/common/collect/ContiguousSetTest.java:301:        Range.closed(1, 3), ContiguousSet.create(Range.closedOpen(1, 4), integers()).range());
./google/common/collect/ContiguousSetTest.java:302:    assertEquals(Range.closed(1, 3), ContiguousSet.closedOpen(1, 4).range());
./google/common/collect/ContiguousSetTest.java:303:    assertEquals(Range.closed(1, 3), ContiguousSet.create(Range.open(0, 4), integers()).range());
./google/common/collect/ContiguousSetTest.java:305:        Range.closed(1, 3), ContiguousSet.create(Range.openClosed(0, 3), integers()).range());
./google/common/collect/ContiguousSetTest.java:309:        ContiguousSet.create(Range.closed(1, 3), integers()).range(OPEN, CLOSED));
./google/common/collect/ContiguousSetTest.java:312:        ContiguousSet.create(Range.closedOpen(1, 4), integers()).range(OPEN, CLOSED));
./google/common/collect/ContiguousSetTest.java:315:        ContiguousSet.create(Range.open(0, 4), integers()).range(OPEN, CLOSED));
./google/common/collect/ContiguousSetTest.java:318:        ContiguousSet.create(Range.openClosed(0, 3), integers()).range(OPEN, CLOSED));
./google/common/collect/ContiguousSetTest.java:321:        Range.open(0, 4), ContiguousSet.create(Range.closed(1, 3), integers()).range(OPEN, OPEN));
./google/common/collect/ContiguousSetTest.java:324:        ContiguousSet.create(Range.closedOpen(1, 4), integers()).range(OPEN, OPEN));
./google/common/collect/ContiguousSetTest.java:326:        Range.open(0, 4), ContiguousSet.create(Range.open(0, 4), integers()).range(OPEN, OPEN));
./google/common/collect/ContiguousSetTest.java:329:        ContiguousSet.create(Range.openClosed(0, 3), integers()).range(OPEN, OPEN));
./google/common/collect/ContiguousSetTest.java:333:        ContiguousSet.create(Range.closed(1, 3), integers()).range(CLOSED, OPEN));
./google/common/collect/ContiguousSetTest.java:336:        ContiguousSet.create(Range.closedOpen(1, 4), integers()).range(CLOSED, OPEN));
./google/common/collect/ContiguousSetTest.java:339:        ContiguousSet.create(Range.open(0, 4), integers()).range(CLOSED, OPEN));
./google/common/collect/ContiguousSetTest.java:342:        ContiguousSet.create(Range.openClosed(0, 3), integers()).range(CLOSED, OPEN));
./google/common/collect/ContiguousSetTest.java:348:        ContiguousSet.create(Range.<Integer>all(), integers()).range());
./google/common/collect/ContiguousSetTest.java:351:        ContiguousSet.create(Range.<Integer>all(), integers()).range(CLOSED, OPEN));
./google/common/collect/ContiguousSetTest.java:353:        Range.all(), ContiguousSet.create(Range.<Integer>all(), integers()).range(OPEN, OPEN));
./google/common/collect/ContiguousSetTest.java:356:        ContiguousSet.create(Range.<Integer>all(), integers()).range(OPEN, CLOSED));
./google/common/collect/ImmutableRangeSetTest.java:557:            rangesBuilder.add(Range.range(i, lbType, j, ubType));
./google/common/collect/TreeRangeSetTest.java:59:            queryBuilder.add(Range.range(i, lowerBoundType, j, upperBoundType));
./google/common/collect/TreeRangeSetTest.java:495:                        range(aLow, aLowType, aHigh, aHighType),
./google/common/collect/TreeRangeSetTest.java:496:                        range(bLow, bLowType, bHigh, bHighType));
./google/common/collect/TreeRangeMapTest.java:300:            builder.add(Range.range(i, lowerType, j, upperType));
./google/common/collect/ImmutableRangeMapTest.java:58:            builder.add(Range.range(i, lowerType, j, upperType));

### Candidate class name: com.google.common.collect.ForwardingDeque, method name: drainTo
not in guave-tests/test/com/

### Candidate class name: com.google.common.escape.Escaper, method name: growBuffer
not in guave-tests/test/com/

## lucene-solr-branch_6_6 lucene_core:
/home/daveroar/git/lucene-solr/lucene/core/src/java/classes/:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar

### Candidate class name: org.apache.lucene.search.similarities.Similarity, method name: computeWeight

$ find . -type f -print | xargs grep -n "computeWeight"
./org/apache/lucene/index/TestIndexSorting.java:1880:    public SimWeight computeWeight(CollectionStatistics collectionStats, TermStatistics... termStats) {
./org/apache/lucene/index/TestIndexSorting.java:1881:      return in.computeWeight(collectionStats, termStats);
./org/apache/lucene/index/TestNorms.java:181:    public SimWeight computeWeight(CollectionStatistics collectionStats, TermStatistics... termStats) {
./org/apache/lucene/index/TestCustomNorms.java:105:    public SimWeight computeWeight(CollectionStatistics collectionStats, TermStatistics... termStats) {
./org/apache/lucene/index/TestUniqueTermCount.java:108:    public SimWeight computeWeight(CollectionStatistics collectionStats, TermStatistics... termStats) {
./org/apache/lucene/search/JustCompileSearch.java:197:    public SimWeight computeWeight(CollectionStatistics collectionStats, TermStatistics... termStats) {
./org/apache/lucene/search/TestConjunctions.java:97:    public SimWeight computeWeight(
./org/apache/lucene/search/TestDocValuesScoring.java:146:    public SimWeight computeWeight(CollectionStatistics collectionStats, TermStatistics... termStats) {
./org/apache/lucene/search/TestDocValuesScoring.java:147:      return sim.computeWeight(collectionStats, termStats);
./org/apache/lucene/search/similarities/TestSimilarityBase.java:199:      BasicStats realStats = (BasicStats) sim.computeWeight(
./org/apache/lucene/search/similarities/TestSimilarityBase.java:532:    BasicStats realStats = (BasicStats) sim.computeWeight(
./org/apache/lucene/search/similarities/TestSimilarityBase.java:651:      BasicStats stats = (BasicStats) sim.computeWeight(collectionStats, termStats);
./org/apache/lucene/search/TestMinShouldMatch2.java:341:          SimWeight w = weight.similarity.computeWeight(
./org/apache/lucene/search/TestBooleanCoord.java:87:      public SimWeight computeWeight(CollectionStatistics collectionStats, TermStatistics... termStats) {

### Candidate class name: org.apache.lucene.search.similarities.Axiomatic, method name: ln
Not in /lucene/core/src/test

### Candidate class name: org.apache.lucene.search.similarities.Axiomatic, method name: tfln
Not in /lucene/core/src/test

### Candidate class name: org.apache.lucene.index.TermsEnum, method name: seekCeil

$ find . -type f -print | xargs grep -n "seekCeil"
./org/apache/lucene/util/fst/TestFSTs.java:403:          final TermsEnum.SeekStatus seekResult = termsEnum.seekCeil(randomTerm);
./org/apache/lucene/util/fst/TestFSTs.java:404:          final InputOutput<Long> fstSeekResult = fstEnum.seekCeil(randomTerm);
./org/apache/lucene/util/fst/TestFSTs.java:732:    assertNull(fstEnum.seekCeil(new BytesRef("foobaz")));
./org/apache/lucene/util/fst/TestFSTs.java:836:    seekResult = fstEnum.seekCeil(new BytesRef("aa"));
./org/apache/lucene/util/fst/TestFSTs.java:965:          status = termsEnum.seekCeil(new BytesRef(id));
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:246:      leftStatus = leftEnum.seekCeil(b);
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:247:      rightStatus = rightEnum.seekCeil(b);
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:253:      leftStatus = leftEnum.seekCeil(b);
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:254:      rightStatus = rightEnum.seekCeil(b);
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:404:    // sequential seekCeil(BytesRef) through all terms
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:407:      assertEquals(SeekStatus.FOUND, actual.seekCeil(expected.term()));
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:430:    // random seekCeil(BytesRef)
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:433:      SeekStatus expectedStatus = expected.seekCeil(target);
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:434:      assertEquals(expectedStatus, actual.seekCeil(target));
./org/apache/lucene/index/TestTermsEnum.java:112:            System.out.println("TEST: iter seekCeil target=" + target.utf8ToString() + " exists=" + exists);
./org/apache/lucene/index/TestTermsEnum.java:114:          // seekCeil
./org/apache/lucene/index/TestTermsEnum.java:115:          final TermsEnum.SeekStatus status = termsEnum.seekCeil(target);
./org/apache/lucene/index/TestTermsEnum.java:649:      // seekCeil or seekExact:
./org/apache/lucene/index/TestTermsEnum.java:663:          System.out.println("  seekCeil");
./org/apache/lucene/index/TestTermsEnum.java:666:        final TermsEnum.SeekStatus result = te.seekCeil(t);
./org/apache/lucene/index/TestTermsEnum.java:945:        TermsEnum.SeekStatus status = termsEnum.seekCeil(termBytesRef);
./org/apache/lucene/index/TestFilterLeafReader.java:151:    assertEquals(TermsEnum.SeekStatus.FOUND, terms.seekCeil(new BytesRef("one")));
./org/apache/lucene/index/TestDirectoryReader.java:94:    te2.seekCeil(new BytesRef("wow"));
./org/apache/lucene/index/TestDirectoryReader.java:102:    te3.seekCeil(new BytesRef("wow"));
./org/apache/lucene/index/TestFlex.java:56:      assertEquals(TermsEnum.SeekStatus.END, terms.seekCeil(new BytesRef("abc")));
./org/apache/lucene/index/Test2BTerms.java:272:      TermsEnum.SeekStatus result = termsEnum.seekCeil(term);
./org/apache/lucene/index/TestTermdocPerf.java:124:      tenum.seekCeil(new BytesRef("val"));
./org/apache/lucene/index/TestSegmentTermDocs.java:60:    terms.seekCeil(new BytesRef("field"));
./org/apache/lucene/index/TestIndexWriterUnicode.java:169:                   terms.seekCeil(tr));
./org/apache/lucene/index/TestCodecs.java:251:      assertEquals(termsEnum.seekCeil(new BytesRef(terms[i].text2)), TermsEnum.SeekStatus.FOUND);
./org/apache/lucene/index/TestCodecs.java:376:        TermsEnum.SeekStatus status = termsEnum.seekCeil(new BytesRef(term.text2));
./org/apache/lucene/index/TestCodecs.java:412:          status = termsEnum.seekCeil(new BytesRef(text2));
./org/apache/lucene/index/TestCodecs.java:422:          assertEquals(Thread.currentThread().getName() + ": field=" + field.fieldInfo.name + " term=" + field.terms[i].text2, TermsEnum.SeekStatus.FOUND, termsEnum.seekCeil(new BytesRef(field.terms[i].text2)));
./org/apache/lucene/index/TestCodecs.java:437:        status = termsEnum.seekCeil(new BytesRef(""));
./org/apache/lucene/index/TestCodecs.java:445:        termsEnum.seekCeil(new BytesRef(""));
./org/apache/lucene/index/TestCodecs.java:638:    public SeekStatus seekCeil(BytesRef text) {
./org/apache/lucene/index/TestStressAdvance.java:84:        assertEquals(TermsEnum.SeekStatus.FOUND, te.seekCeil(new BytesRef("a")));
./org/apache/lucene/index/TestStressAdvance.java:88:        assertEquals(TermsEnum.SeekStatus.FOUND, te.seekCeil(new BytesRef("b")));
./org/apache/lucene/index/TestTermsEnum2.java:131:            assertEquals(SeekStatus.FOUND, te.seekCeil(term));
./org/apache/lucene/index/TestTermsEnum2.java:149:          assertEquals(SeekStatus.FOUND, te.seekCeil(term));
./org/apache/lucene/index/TestSegmentTermEnum.java:124:    termEnum.seekCeil(new BytesRef("aaa"));
./org/apache/lucene/search/TestTermQuery.java:130:                public SeekStatus seekCeil(BytesRef text) throws IOException {
./org/apache/lucene/search/TestPhrasePrefixQuery.java:77:    te.seekCeil(new BytesRef(prefix));
./org/apache/lucene/search/TestMultiPhraseQuery.java:76:    te.seekCeil(new BytesRef(prefix));
./org/apache/lucene/search/TestMultiPhraseQuery.java:104:    te.seekCeil(new BytesRef(prefix));

### Candidate class name: org.apache.lucene.util.AttributeImpl, method name: reflectWith
./org/apache/lucene/analysis/TestToken.java:99:    public void reflectWith(AttributeReflector reflector) {}
./org/apache/lucene/index/Test2BTerms.java:133:      public void reflectWith(AttributeReflector reflector) {

### Candidate class name: org.apache.lucene.index.DocValuesWriter, method name: getDocComparator
Not in /lucene/core/src/test

### Candidate class name: org.apache.lucene.store.IndexInput, method name: seek
./org/apache/lucene/util/bkd/Test2BBKDPoints.java:69:    in.seek(indexFP);
./org/apache/lucene/util/bkd/Test2BBKDPoints.java:109:    in.seek(indexFP);
./org/apache/lucene/util/bkd/TestBKD.java:63:        in.seek(indexFP);
./org/apache/lucene/util/bkd/TestBKD.java:164:        in.seek(indexFP);
./org/apache/lucene/util/bkd/TestBKD.java:292:        in.seek(indexFP);
./org/apache/lucene/util/bkd/TestBKD.java:715:          in.seek(fp);
./org/apache/lucene/util/bkd/TestBKD.java:729:      in.seek(indexFP);
./org/apache/lucene/util/bkd/TestBKD.java:981:      in.seek(fp);
./org/apache/lucene/util/bkd/TestBKD.java:1025:      in.seek(fp);
./org/apache/lucene/util/bkd/TestBKD.java:1079:    in.seek(fp);
./org/apache/lucene/util/bkd/TestBKD.java:1136:    pointsIn.seek(indexFP);

./org/apache/lucene/util/packed/TestPackedInts.java:226:          in.seek(0L);
./org/apache/lucene/util/packed/TestPackedInts.java:234:          in.seek(0L);
./org/apache/lucene/util/packed/TestPackedInts.java:240:          in.seek(0L);
./org/apache/lucene/util/packed/TestPackedInts.java:1142:      in1.seek(0L);
./org/apache/lucene/util/packed/TestPackedInts.java:1167:        ((IndexInput) in).seek(0L);
./org/apache/lucene/util/packed/TestPackedInts.java:1188:      in1.seek(0L);
./org/apache/lucene/util/packed/TestPackedInts.java:1268:    in.seek(0L);
./org/apache/lucene/store/TestHugeRamFile.java:93:      in.seek(loc/3);
./org/apache/lucene/store/TestHugeRamFile.java:94:      in.seek(loc);
./org/apache/lucene/store/TestMmapDirectory.java:63:            clone.seek(0);
./org/apache/lucene/store/TestBufferedIndexInput.java:84:        input.seek(0L);
./org/apache/lucene/store/TestBufferedIndexInput.java:95:        input.seek(0L);
./org/apache/lucene/store/TestBufferedIndexInput.java:105:        input.seek(0L);
./org/apache/lucene/store/TestBufferedIndexInput.java:141:     input.seek(pos);
./org/apache/lucene/store/TestBufferedIndexInput.java:143:     input.seek(pos);
./org/apache/lucene/store/TestBufferedIndexInput.java:149:     input.seek(pos);
./org/apache/lucene/store/TestBufferedIndexInput.java:156:     input.seek(pos);
./org/apache/lucene/store/TestBufferedIndexInput.java:189:      protected void seekInternal(long pos) throws IOException {
./org/apache/lucene/store/TestDirectory.java:79:        input.seek(1L);
./org/apache/lucene/store/TestMultiMMap.java:160:      ii.seek(0L);
./org/apache/lucene/store/TestMultiMMap.java:173:      ii.seek(0L);
./org/apache/lucene/store/TestMultiMMap.java:192:      ii.seek(1<<i);
./org/apache/lucene/store/TestMultiMMap.java:211:      ii.seek(1<<i);
./org/apache/lucene/store/TestMultiMMap.java:234:          ii.seek(sliceStart);
./org/apache/lucene/store/TestMultiMMap.java:244:  // note instead of seeking to offset and reading length, this opens slices at the
./org/apache/lucene/store/TestMultiMMap.java:361:      ii.seek(0L);
./org/apache/lucene/store/TestRAMDirectory.java:179:          is.seek(0);
./org/apache/lucene/store/TestRAMDirectory.java:181:          is.seek(len + random().nextInt(2048));

### Candidate class name: org.apache.lucene.index.PostingsEnum, method name: advance
./org/apache/lucene/util/TestFixedBitSet.java:95:      bb = (bb < b.length() && random().nextBoolean()) ? iterator.nextDoc() : iterator.advance(bb + 1);
./org/apache/lucene/util/TestFixedBitSet.java:106:      bb = random().nextBoolean() ? iterator.nextDoc() : iterator.advance(bb + 1);
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:417:        // advance()
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:419:        docid = leftDocs.advance(skip);
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:420:        assertEquals(docid, rightDocs.advance(skip));
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:450:        // advance()
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:452:        docid = leftDocs.advance(skip);
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:453:        assertEquals(docid, rightDocs.advance(skip));
./org/apache/lucene/index/TestPayloads.java:239:    tp.advance(5);
./org/apache/lucene/index/TestPayloads.java:254:    tp.advance(skipInterval - 1);
./org/apache/lucene/index/TestPayloads.java:257:    tp.advance(2 * skipInterval - 1);
./org/apache/lucene/index/TestPayloads.java:260:    tp.advance(3 * skipInterval - 1);
./org/apache/lucene/index/TestLongPostings.java:216:          // advance
./org/apache/lucene/index/TestLongPostings.java:224:            System.out.println("TEST: docID=" + docID + "; do advance(" + targetDocID + ")");
./org/apache/lucene/index/TestLongPostings.java:238:          docID = postings.advance(targetDocID);
./org/apache/lucene/index/TestLongPostings.java:417:          // advance
./org/apache/lucene/index/TestLongPostings.java:425:            System.out.println("TEST: docID=" + docID + "; do advance(" + targetDocID + ")");
./org/apache/lucene/index/TestLongPostings.java:439:          docID = docs.advance(targetDocID);
./org/apache/lucene/index/TestMultiLevelSkipList.java:99:    tp.advance(target);
./org/apache/lucene/index/TestSegmentTermDocs.java:137:    assertTrue(tdocs.advance(2) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:139:    assertTrue(tdocs.advance(4) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:141:    assertTrue(tdocs.advance(9) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:143:    assertFalse(tdocs.advance(10) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:152:    assertTrue(tdocs.advance(0) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:154:    assertTrue(tdocs.advance(4) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:156:    assertTrue(tdocs.advance(9) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:158:    assertFalse(tdocs.advance(10) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:175:    assertTrue(tdocs.advance(12) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:177:    assertTrue(tdocs.advance(15) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:179:    assertTrue(tdocs.advance(24) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:181:    assertTrue(tdocs.advance(25) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:183:    assertFalse(tdocs.advance(26) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:192:    assertTrue(tdocs.advance(5) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:194:    assertTrue(tdocs.advance(15) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:196:    assertTrue(tdocs.advance(24) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:198:    assertTrue(tdocs.advance(25) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:200:    assertFalse(tdocs.advance(26) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:217:    assertTrue(tdocs.advance(28) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:219:    assertTrue(tdocs.advance(40) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:221:    assertTrue(tdocs.advance(57) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:223:    assertTrue(tdocs.advance(74) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:225:    assertTrue(tdocs.advance(75) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:227:    assertFalse(tdocs.advance(76) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:235:    assertTrue(tdocs.advance(5) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:237:    assertTrue(tdocs.advance(40) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:239:    assertTrue(tdocs.advance(57) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:241:    assertTrue(tdocs.advance(74) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:243:    assertTrue(tdocs.advance(75) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestSegmentTermDocs.java:245:    assertFalse(tdocs.advance(76) != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestDocsAndPositions.java:73:        final int advance = docsAndPosEnum.advance(random().nextInt(leafReaderContext.reader().maxDoc()));
./org/apache/lucene/index/TestDocsAndPositions.java:75:          String msg = "Advanced to: " + advance + " current doc: "
./org/apache/lucene/index/TestDocsAndPositions.java:155:        // initially advance or do next doc
./org/apache/lucene/index/TestDocsAndPositions.java:159:          initDoc = docsAndPosEnum.advance(random().nextInt(maxDoc));
./org/apache/lucene/index/TestDocsAndPositions.java:180:          if (random().nextInt(10) == 0) { // once is a while advance
./org/apache/lucene/index/TestDocsAndPositions.java:181:            if (docsAndPosEnum.advance(docID + 1 + random().nextInt((maxDoc - docID))) == DocIdSetIterator.NO_MORE_DOCS) {
./org/apache/lucene/index/TestDocsAndPositions.java:241:              int advancedTo = postingsEnum.advance(next);

./org/apache/lucene/index/TestDocsAndPositions.java:315:          initDoc = docsAndPosEnum.advance(random().nextInt(maxDoc));
./org/apache/lucene/index/TestCodecs.java:469:                  doc = postings.advance(term.docs[upto2]);
./org/apache/lucene/index/TestCodecs.java:472:                  doc = postings.advance(1+term.docs[upto2]);
./org/apache/lucene/index/TestCodecs.java:711:    public int advance(int target) {
./org/apache/lucene/index/TestStressAdvance.java:117:        // test advance()
./org/apache/lucene/index/TestStressAdvance.java:120:          System.out.println("    do advance inc=" + inc);
./org/apache/lucene/index/TestStressAdvance.java:123:        docID = docs.advance(expected.get(upto));
./org/apache/lucene/index/Test2BDocs.java:115:          int res = docs.advance(target);
./org/apache/lucene/index/TestPostingsOffsets.java:185:      int doc = dp.advance(num);
./org/apache/lucene/index/TestPostingsOffsets.java:347:      // TODO: test advance:

### Candidate class name: org.apache.lucene.util.AttributeImpl, method name: copyTo
./org/apache/lucene/util/TestAttributeSource.java:105:    clone.copyTo(src);
./org/apache/lucene/util/TestAttributeSource.java:171:    // test copyTo()
./org/apache/lucene/util/TestAttributeSource.java:173:    src.copyTo(clone);
./org/apache/lucene/analysis/TestToken.java:91:    public void copyTo(AttributeImpl target) {}
./org/apache/lucene/analysis/tokenattributes/TestCharTermAttributeImpl.java:286:    att.copyTo(copy);
./org/apache/lucene/analysis/tokenattributes/TestBytesRefAttImpl.java:43:    att.copyTo(copy);
./org/apache/lucene/index/Test2BTerms.java:123:      public void copyTo(AttributeImpl target) {

### Candidate class name: org.apache.lucene.codecs.FieldInfosFormat, method name: indexOptionsByte
Not in /lucene/core/src/test

### Candidate class name: org.apache.lucene.index.DocValuesFieldUpdates, method name: merge
./org/apache/lucene/util/bkd/TestBKD.java:644:        // Sometimes we will call merge with a single segment:
./org/apache/lucene/util/bkd/TestBKD.java:719:        indexFP = w.merge(out, docMaps, readers);

./org/apache/lucene/codecs/perfield/TestPerFieldDocValuesFormat.java:228:        public void merge(MergeState mergeState) throws IOException {
./org/apache/lucene/codecs/perfield/TestPerFieldDocValuesFormat.java:230:          for (FieldInfo fi : mergeState.mergeFieldInfos) {
./org/apache/lucene/codecs/perfield/TestPerFieldDocValuesFormat.java:233:          consumer.merge(mergeState);
./org/apache/lucene/codecs/perfield/TestPerFieldPostingsFormat2.java:109:   * Test that heterogeneous index segments are merge successfully
./org/apache/lucene/codecs/perfield/TestPerFieldPostingsFormat2.java:132:   * Test that heterogeneous index segments are merged sucessfully
./org/apache/lucene/codecs/perfield/TestPerFieldPostingsFormat2.java:371:    doc.add(new IntPoint("f3", 3)); // Points are not indexed as postings and should not appear in the merge fields
./org/apache/lucene/codecs/perfield/TestPerFieldPostingsFormat2.java:415:        public void merge(MergeState mergeState) throws IOException {
./org/apache/lucene/codecs/perfield/TestPerFieldPostingsFormat2.java:417:          for (FieldInfo fi : mergeState.mergeFieldInfos) {
./org/apache/lucene/codecs/perfield/TestPerFieldPostingsFormat2.java:420:          consumer.merge(mergeState);
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:361:    // now compare again after the merge

./org/apache/lucene/index/TestUpgradeIndexMergePolicy.java:22:  public MergePolicy mergePolicy() {
./org/apache/lucene/index/TestIndexSorting.java:104:            public void merge(MergeState mergeState) throws IOException {
./org/apache/lucene/index/TestIndexSorting.java:105:              // For single segment merge we cannot infer if the segment is already sorted or not.
./org/apache/lucene/index/TestIndexSorting.java:106:              if (mergeState.docMaps.length > 1) {
./org/apache/lucene/index/TestIndexSorting.java:107:                assertEquals(needsIndexSort, mergeState.needsIndexSort);
./org/apache/lucene/index/TestIndexSorting.java:110:              writer.merge(mergeState);

./org/apache/lucene/index/TestSegmentMerger.java:87:    final SegmentInfo si = new SegmentInfo(mergedDir, Version.LATEST, mergedSegment, -1, false, codec, Collections.emptyMap(), StringHelper.randomId(), new HashMap<>(), null);
./org/apache/lucene/index/TestSegmentMerger.java:89:    SegmentMerger merger = new SegmentMerger(Arrays.<CodecReader>asList(reader1, reader2),
./org/apache/lucene/index/TestSegmentMerger.java:90:                                             si, InfoStream.getDefault(), mergedDir,
./org/apache/lucene/index/TestSegmentMerger.java:93:    MergeState mergeState = merger.merge();
./org/apache/lucene/index/TestSegmentMerger.java:94:    int docsMerged = mergeState.segmentInfo.maxDoc();
./org/apache/lucene/index/TestSegmentMerger.java:97:    SegmentReader mergedReader = new SegmentReader(new SegmentCommitInfo(
./org/apache/lucene/index/TestSegmentMerger.java:98:                                                         mergeState.segmentInfo,

### Candidate class name: org.apache.lucene.index.TermsEnum, method name: postings

./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:297:          assertDocsAndPositionsEnum(leftPositions = leftTermsEnum.postings(leftPositions, PostingsEnum.ALL),
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:298:                                     rightPositions = rightTermsEnum.postings(rightPositions, PostingsEnum.ALL));
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:301:                                  leftPositions = leftTermsEnum.postings(leftPositions, PostingsEnum.ALL),
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:302:                                  rightPositions = rightTermsEnum.postings(rightPositions, PostingsEnum.ALL));
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:304:          assertDocsAndPositionsEnum(leftPositions = leftTermsEnum.postings(leftPositions, PostingsEnum.PAYLOADS),
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:305:                                     rightPositions = rightTermsEnum.postings(rightPositions, PostingsEnum.PAYLOADS));
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:308:                                  leftPositions = leftTermsEnum.postings(leftPositions, PostingsEnum.PAYLOADS),
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:309:                                  rightPositions = rightTermsEnum.postings(rightPositions, PostingsEnum.PAYLOADS));
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:312:          assertDocsAndPositionsEnum(leftPositions = leftTermsEnum.postings(leftPositions, PostingsEnum.OFFSETS),
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:313:                                     rightPositions = rightTermsEnum.postings(rightPositions, PostingsEnum.OFFSETS));
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:316:                                  leftPositions = leftTermsEnum.postings(leftPositions, PostingsEnum.OFFSETS),
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:317:                                  rightPositions = rightTermsEnum.postings(rightPositions, PostingsEnum.OFFSETS));
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:320:          assertDocsAndPositionsEnum(leftPositions = leftTermsEnum.postings(leftPositions, PostingsEnum.POSITIONS),
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:321:                                     rightPositions = rightTermsEnum.postings(rightPositions, PostingsEnum.POSITIONS));
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:324:                                  leftPositions = leftTermsEnum.postings(leftPositions, PostingsEnum.POSITIONS),
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:325:                                  rightPositions = rightTermsEnum.postings(rightPositions, PostingsEnum.POSITIONS));
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:329:        assertDocsEnum(leftDocs = leftTermsEnum.postings(leftDocs),
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:330:            rightDocs = rightTermsEnum.postings(rightDocs));
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:333:        assertDocsEnum(leftDocs = leftTermsEnum.postings(leftDocs, PostingsEnum.NONE),
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:334:            rightDocs = rightTermsEnum.postings(rightDocs, PostingsEnum.NONE));
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:338:            leftDocs = leftTermsEnum.postings(leftDocs),
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:339:            rightDocs = rightTermsEnum.postings(rightDocs));
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:343:            leftDocs = leftTermsEnum.postings(leftDocs, PostingsEnum.NONE),
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:344:            rightDocs = rightTermsEnum.postings(rightDocs, PostingsEnum.NONE));
./org/apache/lucene/codecs/perfield/TestPerFieldDocValuesFormat.java:84:  // is respected by all codec apis (not just docvalues and postings)
./org/apache/lucene/codecs/perfield/TestPerFieldPostingsFormat2.java:371:    doc.add(new IntPoint("f3", 3)); // Points are not indexed as postings and should not appear in the merge fields
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:281:  // the postings format correctly.
./org/apache/lucene/index/TestTermsEnum.java:318:        PostingsEnum postingsEnum = null;
./org/apache/lucene/index/TestTermsEnum.java:327:          postingsEnum = TestUtil.docs(random(), te, postingsEnum, PostingsEnum.NONE);
./org/apache/lucene/index/TestTermsEnum.java:328:          final int docID = postingsEnum.nextDoc();
./org/apache/lucene/index/TestTermsEnum.java:741:    assertEquals(0, te.postings(null, PostingsEnum.NONE).nextDoc());
./org/apache/lucene/index/TestTermsEnum.java:743:    assertEquals(1, te.postings(null, PostingsEnum.NONE).nextDoc());
./org/apache/lucene/index/TestTermsEnum.java:745:    assertEquals(2, te.postings(null, PostingsEnum.NONE).nextDoc());
./org/apache/lucene/index/TestTermsEnum.java:750:    assertEquals(1, te.postings(null, PostingsEnum.NONE).nextDoc());
./org/apache/lucene/index/TestTermsEnum.java:752:    assertEquals(2, te.postings(null, PostingsEnum.NONE).nextDoc());
./org/apache/lucene/index/TestTermsEnum.java:757:    assertEquals(1, te.postings(null, PostingsEnum.NONE).nextDoc());
./org/apache/lucene/index/TestTermsEnum.java:759:    assertEquals(2, te.postings(null, PostingsEnum.NONE).nextDoc());
./org/apache/lucene/index/TestTermsEnum.java:799:    assertEquals(1, te.postings(null, PostingsEnum.NONE).nextDoc());
./org/apache/lucene/index/TestTermsEnum.java:801:    assertEquals(2, te.postings(null, PostingsEnum.NONE).nextDoc());
./org/apache/lucene/index/TestTermsEnum.java:803:    assertEquals(3, te.postings(null, PostingsEnum.NONE).nextDoc());
./org/apache/lucene/index/TestTermsEnum.java:809:    assertEquals(3, te.postings(null, PostingsEnum.NONE).nextDoc());
./org/apache/lucene/index/TestTermsEnum.java:853:    de = te.postings(null, PostingsEnum.NONE);
./org/apache/lucene/index/TestTermsEnum.java:858:    de = te.postings(null, PostingsEnum.NONE);
./org/apache/lucene/index/TestTermsEnum.java:868:    de = te.postings(null, PostingsEnum.NONE);
./org/apache/lucene/index/TestTermsEnum.java:904:    PostingsEnum postingsEnum = null;
./org/apache/lucene/index/TestTermsEnum.java:930:        postingsEnum = termsEnum.postings(postingsEnum, 0);
./org/apache/lucene/index/TestTermsEnum.java:931:        int docID = postingsEnum.nextDoc();
./org/apache/lucene/index/TestFilterLeafReader.java:78:      public PostingsEnum postings(PostingsEnum reuse, int flags) throws IOException {
./org/apache/lucene/index/TestFilterLeafReader.java:79:        return new TestPositions(super.postings(reuse == null ? null : ((FilterPostingsEnum) reuse).in, flags));
./org/apache/lucene/index/TestFilterLeafReader.java:136:    // We mess with the postings so this can fail:
./org/apache/lucene/index/TestFilterLeafReader.java:153:    PostingsEnum positions = terms.postings(null, PostingsEnum.ALL);
./org/apache/lucene/index/TestPayloads.java:486:      tp = terms.postings(tp, PostingsEnum.PAYLOADS);
./org/apache/lucene/index/TestPayloads.java:607:    PostingsEnum de = te.postings(null, PostingsEnum.PAYLOADS);
./org/apache/lucene/index/TestPayloads.java:641:    PostingsEnum de = sr.postings(new Term("field", "withPayload"), PostingsEnum.PAYLOADS);
./org/apache/lucene/index/TestDoc.java:262:        PostingsEnum positions = tis.postings(null, PostingsEnum.POSITIONS);
./org/apache/lucene/index/TestPerSegmentDeletes.java:228:      PostingsEnum postingsEnum = TestUtil.docs(random(), ctermsEnum, null, PostingsEnum.NONE);
./org/apache/lucene/index/TestPerSegmentDeletes.java:229:      return toArray(postingsEnum);
./org/apache/lucene/index/TestPerSegmentDeletes.java:234:  public static int[] toArray(PostingsEnum postingsEnum) throws IOException {
./org/apache/lucene/index/TestPerSegmentDeletes.java:237:    while (postingsEnum.nextDoc() != DocIdSetIterator.NO_MORE_DOCS) {
./org/apache/lucene/index/TestPerSegmentDeletes.java:238:      int docID = postingsEnum.docID();
./org/apache/lucene/index/Test2BPostingsBytes.java:42: * so you get &gt; Integer.MAX_VALUE postings data for the term
./org/apache/lucene/index/TestDirectoryReader.java:632:        PostingsEnum tp1 = enum1.postings(null, PostingsEnum.ALL);
./org/apache/lucene/index/TestDirectoryReader.java:633:        PostingsEnum tp2 = enum2.postings(null, PostingsEnum.ALL);
./org/apache/lucene/index/TestLongPostings.java:79:    Directory dir = newFSDirectory(createTempDir("longpostings" + "." + random().nextLong()));
./org/apache/lucene/index/TestLongPostings.java:169:      final PostingsEnum postings = MultiFields.getTermPositionsEnum(r, "field", new BytesRef(term));
./org/apache/lucene/index/TestLongPostings.java:190:          docID = postings.nextDoc();
./org/apache/lucene/index/TestLongPostings.java:203:            final int freq = postings.freq();
./org/apache/lucene/index/TestLongPostings.java:206:              assertEquals(pos, postings.nextPosition());
./org/apache/lucene/index/TestLongPostings.java:208:                postings.getPayload();
./org/apache/lucene/index/TestLongPostings.java:210:                  postings.getPayload(); // get it again
./org/apache/lucene/index/TestLongPostings.java:238:          docID = postings.advance(targetDocID);
./org/apache/lucene/index/TestLongPostings.java:248:            final int freq = postings.freq();
./org/apache/lucene/index/TestLongPostings.java:251:              assertEquals(pos, postings.nextPosition());
./org/apache/lucene/index/TestLongPostings.java:253:                postings.getPayload();
./org/apache/lucene/index/TestLongPostings.java:255:                  postings.getPayload(); // get it again
./org/apache/lucene/index/TestLongPostings.java:276:    Directory dir = newFSDirectory(createTempDir("longpostings" + "." + random().nextLong()));
./org/apache/lucene/index/TestLongPostings.java:373:      final PostingsEnum postings;
./org/apache/lucene/index/TestLongPostings.java:377:        postings = null;
./org/apache/lucene/index/TestLongPostings.java:379:        docs = postings = TestUtil.docs(random(), r, "field", new BytesRef(term), null, PostingsEnum.FREQS);
./org/apache/lucene/index/TestLongPostings.java:380:        assert postings != null;
./org/apache/lucene/index/TestLongPostings.java:412:          if (random().nextInt(6) == 3 && postings != null) {
./org/apache/lucene/index/TestLongPostings.java:413:            final int freq = postings.freq();
./org/apache/lucene/index/TestLongPostings.java:448:          if (random().nextInt(6) == 3 && postings != null) {
./org/apache/lucene/index/TestLongPostings.java:449:            final int freq = postings.freq();
./org/apache/lucene/index/TestLazyProxSkipping.java:133:      assumeFalse("This test cannot run with Memory postings format", fieldFormat.equals("Memory"));
./org/apache/lucene/index/TestLazyProxSkipping.java:134:      assumeFalse("This test cannot run with Direct postings format", fieldFormat.equals("Direct"));
./org/apache/lucene/index/TestLazyProxSkipping.java:135:      assumeFalse("This test cannot run with SimpleText postings format", fieldFormat.equals("SimpleText"));
./org/apache/lucene/index/TestMultiLevelSkipList.java:87:      PostingsEnum tp = reader.postings(term, PostingsEnum.ALL);
./org/apache/lucene/index/TestDocumentWriter.java:241:    PostingsEnum termPositions = reader.postings(new Term("preanalyzed", "term1"), PostingsEnum.ALL);
./org/apache/lucene/index/TestDocumentWriter.java:246:    termPositions = reader.postings(new Term("preanalyzed", "term2"), PostingsEnum.ALL);
./org/apache/lucene/index/TestDocumentWriter.java:252:    termPositions = reader.postings(new Term("preanalyzed", "term3"), PostingsEnum.ALL);
./org/apache/lucene/index/TestTermVectorsReader.java:225:      PostingsEnum postingsEnum = null;
./org/apache/lucene/index/TestTermVectorsReader.java:233:        postingsEnum = TestUtil.docs(random(), termsEnum, postingsEnum, PostingsEnum.NONE);
./org/apache/lucene/index/TestTermVectorsReader.java:234:        assertNotNull(postingsEnum);
./org/apache/lucene/index/TestTermVectorsReader.java:235:        int doc = postingsEnum.docID();
./org/apache/lucene/index/TestTermVectorsReader.java:237:        assertTrue(postingsEnum.nextDoc() != DocIdSetIterator.NO_MORE_DOCS);
./org/apache/lucene/index/TestTermVectorsReader.java:238:        assertEquals(DocIdSetIterator.NO_MORE_DOCS, postingsEnum.nextDoc());
./org/apache/lucene/index/TestTermVectorsReader.java:260:      dpEnum = termsEnum.postings(dpEnum, PostingsEnum.ALL);
./org/apache/lucene/index/TestTermVectorsReader.java:271:      dpEnum = termsEnum.postings(dpEnum, PostingsEnum.ALL);
./org/apache/lucene/index/TestTermVectorsReader.java:296:      assertNotNull(termsEnum.postings(null));
./org/apache/lucene/index/TestTermVectorsReader.java:297:      assertNotNull(termsEnum.postings(null, PostingsEnum.ALL));
./org/apache/lucene/index/TestTermVectorsReader.java:316:      dpEnum = termsEnum.postings(dpEnum, PostingsEnum.ALL);
./org/apache/lucene/index/TestTermVectorsReader.java:325:      dpEnum = termsEnum.postings(dpEnum, PostingsEnum.ALL);
./org/apache/lucene/index/TestBagOfPostings.java:44:    List<String> postingsList = new ArrayList<>();
./org/apache/lucene/index/TestBagOfPostings.java:65:        postingsList.add(term);
./org/apache/lucene/index/TestBagOfPostings.java:68:    Collections.shuffle(postingsList, random());
./org/apache/lucene/index/TestBagOfPostings.java:70:    final ConcurrentLinkedQueue<String> postings = new ConcurrentLinkedQueue<>(postingsList);
./org/apache/lucene/index/TestBagOfPostings.java:72:    Directory dir = newFSDirectory(createTempDir("bagofpostings"));
./org/apache/lucene/index/TestBagOfPostings.java:93:              while (!postings.isEmpty()) {
./org/apache/lucene/index/TestBagOfPostings.java:97:                  String token = postings.poll();
./org/apache/lucene/index/TestBagOfPostings.java:103:                    postings.add(token);
./org/apache/lucene/index/TestBagOfPostings.java:130:    // numTerms-1 because there cannot be a term 0 with 0 postings:
./org/apache/lucene/index/TestBagOfPostings.java:139:      // from a postingsEnum.
./org/apache/lucene/index/TestIndexWriter.java:829:    PostingsEnum dpEnum = termsEnum.postings(null, PostingsEnum.ALL);
./org/apache/lucene/index/TestIndexWriter.java:836:    dpEnum = termsEnum.postings(dpEnum, PostingsEnum.ALL);
./org/apache/lucene/index/TestDocsAndPositions.java:98:        return te.postings(null, PostingsEnum.ALL);
./org/apache/lucene/index/TestDocsAndPositions.java:228:        PostingsEnum postingsEnum = TestUtil.docs(random(), context.reader(), fieldName, bytes, null, PostingsEnum.FREQS);
./org/apache/lucene/index/TestDocsAndPositions.java:230:          assertNull(postingsEnum);
./org/apache/lucene/index/TestDocsAndPositions.java:233:        assertNotNull(postingsEnum);
./org/apache/lucene/index/TestDocsAndPositions.java:234:        postingsEnum.nextDoc();
./org/apache/lucene/index/TestDocsAndPositions.java:237:            assertEquals(j, postingsEnum.docID());
./org/apache/lucene/index/TestDocsAndPositions.java:238:            assertEquals(postingsEnum.freq(), freqInDoc[context.docBase +j]);
./org/apache/lucene/index/TestDocsAndPositions.java:241:              int advancedTo = postingsEnum.advance(next);
./org/apache/lucene/index/TestDocsAndPositions.java:248:              postingsEnum.nextDoc();
./org/apache/lucene/index/TestDocsAndPositions.java:252:        assertEquals("docBase: " + context.docBase + " maxDoc: " + maxDoc + " " + postingsEnum.getClass(), DocIdSetIterator.NO_MORE_DOCS, postingsEnum.docID());
./org/apache/lucene/index/TestDocsAndPositions.java:363:    PostingsEnum disi = r.postings(new Term("foo", "bar"), PostingsEnum.ALL);
./org/apache/lucene/index/TestDocsAndPositions.java:371:    disi = te.postings(disi, PostingsEnum.ALL);
./org/apache/lucene/index/TestAddIndexes.java:551:    PostingsEnum postingsEnum = TestUtil.docs(random(), reader, term.field, term.bytes, null, PostingsEnum.NONE);
./org/apache/lucene/index/TestAddIndexes.java:553:    while (postingsEnum.nextDoc() != DocIdSetIterator.NO_MORE_DOCS)
./org/apache/lucene/index/TestIndexableField.java:281:            PostingsEnum dpEnum = termsEnum.postings(null, PostingsEnum.ALL);
./org/apache/lucene/index/TestIndexableField.java:288:            dpEnum = termsEnum.postings(dpEnum, PostingsEnum.ALL);
./org/apache/lucene/index/TestDuelingCodecs.java:58:    // for now it's SimpleText vs Default(random postings format)
./org/apache/lucene/index/TestMaxPosition.java:81:    PostingsEnum postings = MultiFields.getTermPositionsEnum(r, "foo", new BytesRef("foo"));
./org/apache/lucene/index/TestMaxPosition.java:84:    assertEquals(0, postings.nextDoc());
./org/apache/lucene/index/TestMaxPosition.java:87:    assertEquals(2, postings.freq());
./org/apache/lucene/index/TestMaxPosition.java:90:    assertEquals(0, postings.nextPosition());
./org/apache/lucene/index/TestMaxPosition.java:93:    assertEquals(IndexWriter.MAX_POSITION, postings.nextPosition());
./org/apache/lucene/index/TestCodecs.java:223:    final FieldsProducer reader = codec.postingsFormat().fieldsProducer(new SegmentReadState(dir, si, fieldInfos, newIOContext(random())));
./org/apache/lucene/index/TestCodecs.java:233:    PostingsEnum postingsEnum = null;
./org/apache/lucene/index/TestCodecs.java:243:        postingsEnum = TestUtil.docs(random(), termsEnum, postingsEnum, PostingsEnum.NONE);
./org/apache/lucene/index/TestCodecs.java:244:        assertEquals(terms[i].docs[0], postingsEnum.nextDoc());
./org/apache/lucene/index/TestCodecs.java:245:        assertEquals(DocIdSetIterator.NO_MORE_DOCS, postingsEnum.nextDoc());
./org/apache/lucene/index/TestCodecs.java:273:      System.out.println("TEST: now write postings");
./org/apache/lucene/index/TestCodecs.java:281:      System.out.println("TEST: now read postings");
./org/apache/lucene/index/TestCodecs.java:283:    final FieldsProducer terms = codec.postingsFormat().fieldsProducer(new SegmentReadState(dir, si, fieldInfos, newIOContext(random())));
./org/apache/lucene/index/TestCodecs.java:325:    private void verifyDocs(final int[] docs, final PositionData[][] positions, final PostingsEnum postingsEnum, final boolean doPos) throws Throwable {
./org/apache/lucene/index/TestCodecs.java:327:        final int doc = postingsEnum.nextDoc();
./org/apache/lucene/index/TestCodecs.java:331:          this.verifyPositions(positions[i], postingsEnum);
./org/apache/lucene/index/TestCodecs.java:334:      assertEquals(DocIdSetIterator.NO_MORE_DOCS, postingsEnum.nextDoc());
./org/apache/lucene/index/TestCodecs.java:382:          this.verifyDocs(term.docs, term.positions, termsEnum.postings(null, PostingsEnum.ALL), true);
./org/apache/lucene/index/TestCodecs.java:402:            this.verifyDocs(term.docs, term.positions, termsEnum.postings(null, PostingsEnum.ALL), true);
./org/apache/lucene/index/TestCodecs.java:450:            final PostingsEnum postings;
./org/apache/lucene/index/TestCodecs.java:452:              // TODO: we should randomize which postings features are available, but
./org/apache/lucene/index/TestCodecs.java:454:              postings = termsEnum.postings(null, PostingsEnum.ALL);
./org/apache/lucene/index/TestCodecs.java:456:              postings = TestUtil.docs(random(), termsEnum, null, PostingsEnum.FREQS);
./org/apache/lucene/index/TestCodecs.java:458:            assertNotNull(postings);
./org/apache/lucene/index/TestCodecs.java:469:                  doc = postings.advance(term.docs[upto2]);
./org/apache/lucene/index/TestCodecs.java:472:                  doc = postings.advance(1+term.docs[upto2]);
./org/apache/lucene/index/TestCodecs.java:487:                doc = postings.nextDoc();
./org/apache/lucene/index/TestCodecs.java:493:                assertEquals(term.positions[upto2].length, postings.freq());
./org/apache/lucene/index/TestCodecs.java:495:                  this.verifyPositions(term.positions[upto2], postings);
./org/apache/lucene/index/TestCodecs.java:501:              assertEquals(DocIdSetIterator.NO_MORE_DOCS, postings.nextDoc());
./org/apache/lucene/index/TestCodecs.java:675:    public PostingsEnum postings(PostingsEnum reuse, int flags) {
./org/apache/lucene/index/TestCodecs.java:754:    FieldsConsumer consumer = codec.postingsFormat().fieldsConsumer(state);
./org/apache/lucene/index/TestCodecs.java:786:      PostingsEnum de = ctx.reader().postings(term);
./org/apache/lucene/index/TestPayloadsOnVectors.java:75:    PostingsEnum de = termsEnum.postings(null, PostingsEnum.ALL);
./org/apache/lucene/index/TestPayloadsOnVectors.java:117:    PostingsEnum de = termsEnum.postings(null, PostingsEnum.ALL);
./org/apache/lucene/index/Test2BDocs.java:98:        PostingsEnum docs = te.postings(null);
./org/apache/lucene/index/TestPostingsOffsets.java:271:        final Map<Integer,List<Token>> postingsByDoc = actualTokens.get(text);
./org/apache/lucene/index/TestPostingsOffsets.java:272:        if (!postingsByDoc.containsKey(docCount)) {
./org/apache/lucene/index/TestPostingsOffsets.java:273:          postingsByDoc.put(docCount, new ArrayList<Token>());
./org/apache/lucene/index/TestPostingsOffsets.java:275:        postingsByDoc.get(docCount).add(token);
./org/apache/lucene/index/TestPostingsOffsets.java:281:        //System.out.println("  " + token + " posIncr=" + token.getPositionIncrement() + " pos=" + pos + " off=" + token.startOffset() + "/" + token.endOffset() + " (freq=" + postingsByDoc.get(docCount).size() + ")");
./org/apache/lucene/index/TestPostingsOffsets.java:302:          docs = termsEnum.postings(docs);
./org/apache/lucene/index/TestPostingsOffsets.java:314:          docsAndPositions = termsEnum.postings(docsAndPositions, PostingsEnum.ALL);
./org/apache/lucene/index/TestPostingsOffsets.java:329:          docsAndPositionsAndOffsets = termsEnum.postings(docsAndPositions, PostingsEnum.ALL);
./org/apache/lucene/index/TestMultiFields.java:138:        PostingsEnum postingsEnum = TestUtil.docs(random(), reader, "field", term, null, PostingsEnum.NONE);
./org/apache/lucene/index/TestMultiFields.java:139:        assertNotNull(postingsEnum);
./org/apache/lucene/index/TestMultiFields.java:142:          assertEquals(docID, postingsEnum.nextDoc());
./org/apache/lucene/index/TestMultiFields.java:144:        assertEquals(DocIdSetIterator.NO_MORE_DOCS, postingsEnum.nextDoc());
./org/apache/lucene/index/TestStressIndexing2.java:407:              dpEnum = termsEnum3.postings(dpEnum, PostingsEnum.ALL);
./org/apache/lucene/index/TestStressIndexing2.java:439:              dpEnum = termsEnum3.postings(dpEnum, PostingsEnum.ALL);
./org/apache/lucene/index/TestStressIndexing2.java:464:    // Verify postings
./org/apache/lucene/index/TestStressIndexing2.java:635:        dpEnum1 = termsEnum1.postings(dpEnum1, PostingsEnum.ALL);
./org/apache/lucene/index/TestStressIndexing2.java:636:        dpEnum2 = termsEnum2.postings(dpEnum2, PostingsEnum.ALL);
./org/apache/lucene/index/TestTermVectorsWriter.java:71:    PostingsEnum dpEnum = termsEnum.postings(null, PostingsEnum.ALL);
./org/apache/lucene/index/TestTermVectorsWriter.java:80:    dpEnum = termsEnum.postings(dpEnum, PostingsEnum.ALL);
./org/apache/lucene/index/TestTermVectorsWriter.java:120:    PostingsEnum dpEnum = termsEnum.postings(null, PostingsEnum.ALL);
./org/apache/lucene/index/TestTermVectorsWriter.java:155:    PostingsEnum dpEnum = termsEnum.postings(null, PostingsEnum.ALL);
./org/apache/lucene/index/TestTermVectorsWriter.java:193:    PostingsEnum dpEnum = termsEnum.postings(null, PostingsEnum.ALL);
./org/apache/lucene/index/TestTermVectorsWriter.java:228:    PostingsEnum dpEnum = termsEnum.postings(null, PostingsEnum.ALL);
./org/apache/lucene/index/TestTermVectorsWriter.java:264:    PostingsEnum dpEnum = termsEnum.postings(null, PostingsEnum.ALL);
./org/apache/lucene/index/TestTermVectorsWriter.java:272:    dpEnum = termsEnum.postings(dpEnum, PostingsEnum.ALL);
./org/apache/lucene/index/TestTermVectorsWriter.java:279:    dpEnum = termsEnum.postings(dpEnum, PostingsEnum.ALL);
./org/apache/lucene/index/TestTermVectorsWriter.java:308:    PostingsEnum dpEnum = termsEnum.postings(null, PostingsEnum.ALL);
./org/apache/lucene/index/TestTermVectorsWriter.java:317:    dpEnum = termsEnum.postings(dpEnum, PostingsEnum.ALL);
./org/apache/lucene/index/TestTermVectorsWriter.java:350:    PostingsEnum dpEnum = termsEnum.postings(null, PostingsEnum.ALL);
./org/apache/lucene/index/TestTermVectorsWriter.java:359:    dpEnum = termsEnum.postings(dpEnum, PostingsEnum.ALL);
./org/apache/lucene/index/TestBagOfPositions.java:45:    List<String> postingsList = new ArrayList<>();
./org/apache/lucene/index/TestBagOfPositions.java:63:        postingsList.add(term);
./org/apache/lucene/index/TestBagOfPositions.java:66:    Collections.shuffle(postingsList, random());
./org/apache/lucene/index/TestBagOfPositions.java:68:    final ConcurrentLinkedQueue<String> postings = new ConcurrentLinkedQueue<>(postingsList);
./org/apache/lucene/index/TestBagOfPositions.java:107:              while (!postings.isEmpty()) {
./org/apache/lucene/index/TestBagOfPositions.java:111:                  String token = postings.poll();
./org/apache/lucene/index/TestBagOfPositions.java:138:    // numTerms-1 because there cannot be a term 0 with 0 postings:
./org/apache/lucene/index/TestBagOfPositions.java:147:      // from a postingsEnum.
./org/apache/lucene/index/TestDemoParallelLeafReader.java:60: *  stuff (postings, DVs, etc.) from previously stored fields, on the
./org/apache/lucene/search/spans/TestSpanCollection.java:80:    public void collectLeaf(PostingsEnum postings, int position, Term term) throws IOException {
./org/apache/lucene/search/TestMultiPhraseEnum.java:34:/** simple tests for unionpostingsenum
./org/apache/lucene/search/TestMultiPhraseEnum.java:51:    PostingsEnum p1 = getOnlyLeafReader(ir).postings(new Term("field", "foo"), PostingsEnum.POSITIONS);
./org/apache/lucene/search/TestMultiPhraseEnum.java:52:    PostingsEnum p2 = getOnlyLeafReader(ir).postings(new Term("field", "bar"), PostingsEnum.POSITIONS);
./org/apache/lucene/search/TestMultiPhraseEnum.java:93:    PostingsEnum p1 = getOnlyLeafReader(ir).postings(new Term("field", "foo"), PostingsEnum.POSITIONS);
./org/apache/lucene/search/TestMultiPhraseEnum.java:94:    PostingsEnum p2 = getOnlyLeafReader(ir).postings(new Term("field", "bar"), PostingsEnum.POSITIONS);
./org/apache/lucene/search/TestPositionIncrement.java:206:    public void collectLeaf(PostingsEnum postings, int position, Term term) throws IOException {
./org/apache/lucene/search/TestPositionIncrement.java:207:      if (postings.getPayload() != null)
./org/apache/lucene/search/TestPositionIncrement.java:208:        payloads.add(BytesRef.deepCopyOf(postings.getPayload()));
./org/apache/lucene/search/TestPositionIncrement.java:228:    PostingsEnum tp = r.postings(new Term("content", "a"), PostingsEnum.ALL);

### Candidate class name: java.util.concurrent.AbstractExecutorService, method name: awaitTermination
./org/apache/lucene/util/TestWeakIdentityMap.java:213:      while (!exec.awaitTermination(1000L, TimeUnit.MILLISECONDS));
./org/apache/lucene/codecs/TestCodecLoadingDeadlock.java:124:    while (!pool.awaitTermination(1, TimeUnit.MINUTES));
./org/apache/lucene/search/TestSearcherManager.java:295:      es.awaitTermination(1, TimeUnit.SECONDS);
./org/apache/lucene/search/TestBooleanQuery.java:293:    es.awaitTermination(1, TimeUnit.SECONDS);

### Candidate class name: org.apache.lucene.search.similarities.Similarity, method name: computeNorm
./org/apache/lucene/index/TestIndexSorting.java:1871:    public long computeNorm(FieldInvertState state) {
./org/apache/lucene/index/TestIndexSorting.java:1875:        return in.computeNorm(state);
./org/apache/lucene/index/TestNorms.java:175:    public long computeNorm(FieldInvertState state) {
./org/apache/lucene/index/TestCustomNorms.java:100:    public long computeNorm(FieldInvertState state) {
./org/apache/lucene/index/TestUniqueTermCount.java:103:    public long computeNorm(FieldInvertState state) {
./org/apache/lucene/search/JustCompileSearch.java:207:    public long computeNorm(FieldInvertState state) {
./org/apache/lucene/search/TestConjunctions.java:92:    public long computeNorm(FieldInvertState state) {
./org/apache/lucene/search/TestDocValuesScoring.java:141:    public long computeNorm(FieldInvertState state) {
./org/apache/lucene/search/TestDocValuesScoring.java:142:      return sim.computeNorm(state);
./org/apache/lucene/search/similarities/TestSimilarityBase.java:597:    assertEquals(expected.computeNorm(state), actual.computeNorm(state));
./org/apache/lucene/search/similarities/TestSimilarityBase.java:600:    assertEquals(expected.computeNorm(state), actual.computeNorm(state));
./org/apache/lucene/search/similarities/TestBooleanSimilarity.java:112:          sim2.computeNorm(state),
./org/apache/lucene/search/similarities/TestBooleanSimilarity.java:113:          sim1.computeNorm(state),
./org/apache/lucene/search/TestBooleanCoord.java:82:      public long computeNorm(FieldInvertState state) {

### Candidate class name: org.apache.lucene.index.MergePolicy, method name: findForcedDeletesMerges
./org/apache/lucene/index/TestPerSegmentDeletes.java:277:    public MergeSpecification findForcedDeletesMerges(
./org/apache/lucene/index/TestNoMergePolicy.java:38:    assertNull(mp.findForcedDeletesMerges(null, null));
./org/apache/lucene/index/TestOneMergeWrappingMergePolicy.java:63:    public MergePolicy.MergeSpecification findForcedDeletesMerges(SegmentInfos segmentInfos, IndexWriter writer)
./org/apache/lucene/index/TestOneMergeWrappingMergePolicy.java:97:      implTestSegmentsAreWrapped(msD, oneMergeWrappingMP.findForcedDeletesMerges(null, null));
./org/apache/lucene/index/TestDemoParallelLeafReader.java:603:      public MergeSpecification findForcedDeletesMerges(SegmentInfos segmentInfos, IndexWriter writer)
./org/apache/lucene/index/TestDemoParallelLeafReader.java:605:        return wrap(in.findForcedDeletesMerges(segmentInfos, writer));

### Candidate class name: org.apache.lucene.index.MergePolicy, method name: findForcedMerges
./org/apache/lucene/index/TestPerSegmentDeletes.java:270:    public MergeSpecification findForcedMerges(SegmentInfos segmentInfos,
./org/apache/lucene/index/TestNoMergePolicy.java:37:    assertNull(mp.findForcedMerges(null, 0, null, null));
./org/apache/lucene/index/TestOneMergeWrappingMergePolicy.java:57:    public MergePolicy.MergeSpecification findForcedMerges(SegmentInfos segmentInfos, int maxSegmentCount,
./org/apache/lucene/index/TestOneMergeWrappingMergePolicy.java:96:      implTestSegmentsAreWrapped(msF, oneMergeWrappingMP.findForcedMerges(null, 0, null, null));
./org/apache/lucene/index/TestDemoParallelLeafReader.java:595:      public MergeSpecification findForcedMerges(SegmentInfos segmentInfos,
./org/apache/lucene/index/TestDemoParallelLeafReader.java:599:        return wrap(in.findForcedMerges(segmentInfos, maxSegmentCount, segmentsToMerge, writer));

### Candidate class name: org.apache.lucene.index.TermsEnum, method name: seekExact
./org/apache/lucene/util/fst/TestFSTs.java:959:          if (termsEnum.seekExact(new BytesRef(id))) {
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:240:      assertEquals(leftEnum.seekExact(b), rightEnum.seekExact(b));
./org/apache/lucene/codecs/lucene50/TestBlockPostingsFormat3.java:241:      assertEquals(leftEnum.seekExact(b), rightEnum.seekExact(b));
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:388:    // sequential seekExact(ord) through all terms
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:390:      expected.seekExact(i);
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:391:      actual.seekExact(i);
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:396:    // sequential seekExact(BytesRef) through all terms
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:398:      expected.seekExact(i);
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:399:      assertTrue(actual.seekExact(expected.term()));
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:406:      expected.seekExact(i);
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:412:    // random seekExact(ord)
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:415:      expected.seekExact(randomOrd);
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:416:      actual.seekExact(randomOrd);
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:421:    // random seekExact(BytesRef)
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:424:      expected.seekExact(randomOrd);
./org/apache/lucene/codecs/lucene54/TestLucene54DocValuesFormat.java:425:      actual.seekExact(expected.term());
./org/apache/lucene/index/TestTermsEnum.java:135:            System.out.println("TEST: iter seekExact target=" + target.utf8ToString() + " exists=" + exists);
./org/apache/lucene/index/TestTermsEnum.java:137:          // seekExact
./org/apache/lucene/index/TestTermsEnum.java:138:          final boolean result = termsEnum.seekExact(target);
./org/apache/lucene/index/TestTermsEnum.java:484:    assertTrue(seekExact(te, "aa1"));
./org/apache/lucene/index/TestTermsEnum.java:486:    assertTrue(seekExact(te, "aa8"));
./org/apache/lucene/index/TestTermsEnum.java:564:  private boolean seekExact(TermsEnum te, String term) throws IOException {
./org/apache/lucene/index/TestTermsEnum.java:565:    return te.seekExact(new BytesRef(term));
./org/apache/lucene/index/TestTermsEnum.java:649:      // seekCeil or seekExact:
./org/apache/lucene/index/TestTermsEnum.java:653:          System.out.println("  seekExact termState");
./org/apache/lucene/index/TestTermsEnum.java:655:        te.seekExact(t, termState);
./org/apache/lucene/index/TestTermsEnum.java:658:          System.out.println("  seekExact");
./org/apache/lucene/index/TestTermsEnum.java:660:        assertEquals(loc >= 0, te.seekExact(t));
./org/apache/lucene/index/TestTermsEnum.java:684:        // TermsEnum is unpositioned if seekExact returns false
./org/apache/lucene/index/TestTermsEnum.java:927:      boolean actualResult = termsEnum.seekExact(termBytesRef);
./org/apache/lucene/index/TestTermsEnum.java:986:        assertTrue("term '" + termsList.get(i).utf8ToString() + "' should exist but doesn't", te.seekExact(termsList.get(i)));
./org/apache/lucene/index/TestTermsEnum.java:989:        assertFalse("term '" + termsList.get(i) + "' shouldn't exist but does", te.seekExact(termsList.get(i)));
./org/apache/lucene/index/TestPayloads.java:606:    assertTrue(te.seekExact(new BytesRef("withPayload")));
./org/apache/lucene/index/TestPerSegmentDeletes.java:227:    if (ctermsEnum.seekExact(new BytesRef(term.text()))) {
./org/apache/lucene/index/TestDocsAndPositions.java:97:      if (te.seekExact(bytes)) {
./org/apache/lucene/index/TestDocsAndPositions.java:345:    assertTrue(te.seekExact(new BytesRef("bar")));
./org/apache/lucene/index/TestDocsAndPositions.java:370:    assertTrue(te.seekExact(new BytesRef("bar")));
./org/apache/lucene/index/TestCodecs.java:390:          termsEnum.seekExact(idx);
./org/apache/lucene/index/TestCodecs.java:429:            termsEnum.seekExact(i);
./org/apache/lucene/index/TestCodecs.java:655:    public void seekExact(long ord) {
./org/apache/lucene/index/TestPayloadsOnVectors.java:74:    assertTrue(termsEnum.seekExact(new BytesRef("withPayload")));
./org/apache/lucene/index/TestPayloadsOnVectors.java:116:    assertTrue(termsEnum.seekExact(new BytesRef("withPayload")));
./org/apache/lucene/index/Test2BDocs.java:97:        assertTrue( te.seekExact(term) );
./org/apache/lucene/index/TestPostingsOffsets.java:301:        if (termsEnum.seekExact(new BytesRef(term))) {
./org/apache/lucene/index/TestTermsEnum2.java:128:            assertTrue(te.seekExact(term));
./org/apache/lucene/index/TestTermsEnum2.java:152:          assertTrue(te.seekExact(term));
./org/apache/lucene/index/TestStressIndexing2.java:358:      if (termsEnum2.seekExact(term)) {
./org/apache/lucene/index/TestSegmentTermEnum.java:98:    terms.seekExact(ordB);
./org/apache/lucene/search/TestTermQuery.java:134:                public void seekExact(BytesRef term, TermState state) throws IOException {
./org/apache/lucene/search/TestTermQuery.java:138:                public boolean seekExact(BytesRef text) throws IOException {
./org/apache/lucene/search/TestTermQuery.java:142:                public void seekExact(long ord) throws IOException {

### Candidate class name: org.apache.lucene.codecs.FieldInfosFormat, method name: docValuesByte
Not in /lucene/core/src/test

### Candidate class name: org.apache.lucene.search.similarities.Axiomatic, method name: idf
./org/apache/lucene/index/TestNorms.java:70:    @Override public float idf(long docFreq, long docCount) { return 0; }
./org/apache/lucene/index/TestMaxTermFrequency.java:121:    @Override public float idf(long docFreq, long docCount) { return 0; }
./org/apache/lucene/index/TestOmitTf.java:56:    @Override public float idf(long docFreq, long docCount) { return 1.0f; }
./org/apache/lucene/index/TestOmitTf.java:57:    @Override public Explanation idfExplain(CollectionStatistics collectionStats, TermStatistics[] termStats) {
./org/apache/lucene/search/TestDisjunctionMaxQuery.java:56:   * Similarity to eliminate tf, idf and lengthNorm effects to isolate test
./org/apache/lucene/search/TestDisjunctionMaxQuery.java:81:    public float idf(long docFreq, long docCount) {
./org/apache/lucene/search/TestSimilarityProvider.java:147:    public float idf(long docFreq, long docCount) {
./org/apache/lucene/search/TestSimilarityProvider.java:195:    public float idf(long docFreq, long docCount) {
./org/apache/lucene/search/TestSimilarity.java:49:    @Override public float idf(long docFreq, long docCount) { return 1.0f; }
./org/apache/lucene/search/TestSimilarity.java:50:    @Override public Explanation idfExplain(CollectionStatistics collectionStats, TermStatistics[] stats) {
./org/apache/lucene/search/TestMultiPhraseQuery.java:350:      public Explanation idfExplain(CollectionStatistics collectionStats, TermStatistics termStats[]) {

### Candidate class name: org.apache.lucene.index.LeafReader, method name: getTermVectors
./org/apache/lucene/index/TestSegmentMerger.java:129:    Terms vector = mergedReader.getTermVectors(0).terms(DocHelper.TEXT_FIELD_2_KEY);
./org/apache/lucene/index/TestDirectoryReader.java:70:    Terms vector = reader.getTermVectors(0).terms(DocHelper.TEXT_FIELD_2_KEY);
./org/apache/lucene/index/TestIndexWriterWithThreads.java:325:            reader.getTermVectors(j);
./org/apache/lucene/index/TestIndexWriter.java:826:    Terms tpv = r.getTermVectors(0).terms("field");
./org/apache/lucene/index/TestTermVectors.java:110:      assertNotNull("term vectors should not have been null for document " + i, r.getTermVectors(i).terms("c"));
./org/apache/lucene/index/TestIndexableField.java:276:            final Terms tfv = r.getTermVectors(docID).terms(name);
./org/apache/lucene/index/TestIndexableField.java:298:            Fields vectors = r.getTermVectors(docID);
./org/apache/lucene/index/TestIndexWriterExceptions.java:680:            reader.getTermVectors(j);
./org/apache/lucene/index/TestIndexWriterExceptions.java:704:        reader.getTermVectors(j);
./org/apache/lucene/index/TestIndexWriterExceptions.java:790:          reader.getTermVectors(j);
./org/apache/lucene/index/TestIndexWriterExceptions.java:813:        reader.getTermVectors(j);
./org/apache/lucene/index/TestStressIndexing2.java:391:        verifyEquals(r1.getTermVectors(id1), r2.getTermVectors(id2));
./org/apache/lucene/index/TestStressIndexing2.java:394:        Fields tv1 = r1.getTermVectors(id1);
./org/apache/lucene/index/TestStressIndexing2.java:426:        Fields tv2 = r2.getTermVectors(id2);
./org/apache/lucene/index/TestTermVectorsWriter.java:62:    Terms vector = r.getTermVectors(0).terms("field");
./org/apache/lucene/index/TestTermVectorsWriter.java:118:    TermsEnum termsEnum = r.getTermVectors(0).terms("field").iterator();
./org/apache/lucene/index/TestTermVectorsWriter.java:153:    TermsEnum termsEnum = r.getTermVectors(0).terms("field").iterator();
./org/apache/lucene/index/TestTermVectorsWriter.java:191:    TermsEnum termsEnum = r.getTermVectors(0).terms("field").iterator();
./org/apache/lucene/index/TestTermVectorsWriter.java:226:    TermsEnum termsEnum = r.getTermVectors(0).terms("field").iterator();
./org/apache/lucene/index/TestTermVectorsWriter.java:262:    TermsEnum termsEnum = r.getTermVectors(0).terms("field").iterator();
./org/apache/lucene/index/TestTermVectorsWriter.java:306:    TermsEnum termsEnum = r.getTermVectors(0).terms("field").iterator();
./org/apache/lucene/index/TestTermVectorsWriter.java:348:    TermsEnum termsEnum = r.getTermVectors(0).terms("field").iterator();
./org/apache/lucene/index/TestTermVectorsWriter.java:406:        reader.getTermVectors(i);
./org/apache/lucene/index/TestTermVectorsWriter.java:457:      assertNull(reader.getTermVectors(0));
./org/apache/lucene/index/TestTermVectorsWriter.java:458:      assertNull(reader.getTermVectors(1));
./org/apache/lucene/index/TestTermVectorsWriter.java:459:      assertNotNull(reader.getTermVectors(2));
./org/apache/lucene/index/TestTermVectorsWriter.java:503:      reader.getTermVectors(i);
./org/apache/lucene/index/TestSegmentReader.java:189:    Terms result = reader.getTermVectors(0).terms(DocHelper.TEXT_FIELD_2_KEY);
./org/apache/lucene/index/TestSegmentReader.java:200:    Fields results = reader.getTermVectors(0);
./org/apache/lucene/index/TestSegmentReader.java:213:      reader.getTermVectors(-1);
./org/apache/lucene/index/TestSegmentReader.java:221:      reader.getTermVectors(numDocs);
./org/apache/lucene/search/TestMultiThreadTermVectors.java:167:      Fields vectors = reader.getTermVectors(docId);
./org/apache/lucene/search/TestMultiThreadTermVectors.java:174:      Terms vector = reader.getTermVectors(docId).terms("field");

### Candidate class name: org.apache.lucene.index.DirectoryReader, method name: doOpenIfChanged
Not in /lucene/core/src/test

### Candidate class name: org.apache.lucene.codecs.FieldInfosFormat, method name: getDocValuesType
./org/apache/lucene/index/TestNumericDocValuesUpdates.java:911:    assertEquals(DocValuesType.NUMERIC, ar.getFieldInfos().fieldInfo("foo").getDocValuesType());
./org/apache/lucene/index/TestDocValuesIndexing.java:204:    assertTrue(dvInfo.getDocValuesType() != DocValuesType.NONE);

### Candidate class name: org.apache.lucene.codecs.FieldInfosFormat, method name: getIndexOptions
./org/apache/lucene/index/TestOmitPositions.java:158:    assertEquals(IndexOptions.DOCS, fi.fieldInfo("f1").getIndexOptions());
./org/apache/lucene/index/TestOmitPositions.java:160:    assertEquals(IndexOptions.DOCS, fi.fieldInfo("f2").getIndexOptions());
./org/apache/lucene/index/TestOmitPositions.java:162:    assertEquals(IndexOptions.DOCS, fi.fieldInfo("f3").getIndexOptions());
./org/apache/lucene/index/TestOmitPositions.java:164:    assertEquals(IndexOptions.DOCS, fi.fieldInfo("f4").getIndexOptions());
./org/apache/lucene/index/TestOmitPositions.java:166:    assertEquals(IndexOptions.DOCS_AND_FREQS, fi.fieldInfo("f5").getIndexOptions());
./org/apache/lucene/index/TestOmitPositions.java:168:    assertEquals(IndexOptions.DOCS_AND_FREQS, fi.fieldInfo("f6").getIndexOptions());
./org/apache/lucene/index/TestOmitPositions.java:170:    assertEquals(IndexOptions.DOCS, fi.fieldInfo("f7").getIndexOptions());
./org/apache/lucene/index/TestOmitPositions.java:172:    assertEquals(IndexOptions.DOCS_AND_FREQS, fi.fieldInfo("f8").getIndexOptions());
./org/apache/lucene/index/TestOmitPositions.java:174:    assertEquals(IndexOptions.DOCS_AND_FREQS_AND_POSITIONS, fi.fieldInfo("f9").getIndexOptions());
./org/apache/lucene/index/TestOmitPositions.java:260:    assertEquals(IndexOptions.DOCS_AND_FREQS, fis.fieldInfo("foo").getIndexOptions());
./org/apache/lucene/index/TestDirectoryReader.java:256:      if (fieldInfo.getIndexOptions() != IndexOptions.NONE) {
./org/apache/lucene/index/TestDocumentWriter.java:96:      if (fi.getIndexOptions() != IndexOptions.NONE) {
./org/apache/lucene/index/TestDocumentWriter.java:291:    assertEquals("omitTermFreqAndPositions field bit should not be set for f1", IndexOptions.DOCS_AND_FREQS_AND_POSITIONS, fi.fieldInfo("f1").getIndexOptions());
./org/apache/lucene/index/TestDocumentWriter.java:294:    assertEquals("omitTermFreqAndPositions field bit should be set for f2", IndexOptions.DOCS, fi.fieldInfo("f2").getIndexOptions());
./org/apache/lucene/index/TestConsistentFieldNumbers.java:271:        assertEquals(expected.fieldType().indexOptions(), fi.getIndexOptions());
./org/apache/lucene/index/TestCodecs.java:595:      return fieldData.fieldInfo.getIndexOptions().compareTo(IndexOptions.DOCS_AND_FREQS) >= 0;
./org/apache/lucene/index/TestCodecs.java:600:      return fieldData.fieldInfo.getIndexOptions().compareTo(IndexOptions.DOCS_AND_FREQS_AND_POSITIONS_AND_OFFSETS) >= 0;
./org/apache/lucene/index/TestCodecs.java:605:      return fieldData.fieldInfo.getIndexOptions().compareTo(IndexOptions.DOCS_AND_FREQS_AND_POSITIONS) >= 0;
./org/apache/lucene/index/TestOmitTf.java:108:    assertEquals("OmitTermFreqAndPositions field bit should be set.", IndexOptions.DOCS, fi.fieldInfo("f1").getIndexOptions());
./org/apache/lucene/index/TestOmitTf.java:109:    assertEquals("OmitTermFreqAndPositions field bit should be set.", IndexOptions.DOCS, fi.fieldInfo("f2").getIndexOptions());
./org/apache/lucene/index/TestOmitTf.java:160:    assertEquals("OmitTermFreqAndPositions field bit should be set.", IndexOptions.DOCS, fi.fieldInfo("f1").getIndexOptions());
./org/apache/lucene/index/TestOmitTf.java:161:    assertEquals("OmitTermFreqAndPositions field bit should be set.", IndexOptions.DOCS, fi.fieldInfo("f2").getIndexOptions());
./org/apache/lucene/index/TestOmitTf.java:203:    assertEquals("OmitTermFreqAndPositions field bit should not be set.", IndexOptions.DOCS_AND_FREQS_AND_POSITIONS, fi.fieldInfo("f1").getIndexOptions());
./org/apache/lucene/index/TestOmitTf.java:204:    assertEquals("OmitTermFreqAndPositions field bit should be set.", IndexOptions.DOCS, fi.fieldInfo("f2").getIndexOptions());
./org/apache/lucene/index/TestPostingsOffsets.java:379:    assertEquals(IndexOptions.DOCS_AND_FREQS_AND_POSITIONS_AND_OFFSETS, fis.fieldInfo("foo").getIndexOptions());
./org/apache/lucene/index/TestSegmentReader.java:87:      if (fieldInfo.getIndexOptions() != IndexOptions.NONE) {
./org/apache/lucene/index/TestSegmentReader.java:94:      } else if (fieldInfo.getIndexOptions() != IndexOptions.NONE) {

### Candidate class name: org.apache.lucene.search.similarities.Axiomatic, method name: tf
Not in /lucene/core/src/test

### Candidate class name: org.apache.lucene.index.CodecReader, method name: removeCoreClosedListener
Not in /lucene/core/src/test

### Candidate class name: org.apache.lucene.index.CodecReader, method name: addCoreClosedListener
Not in /lucene/core/src/test

### Candidate class name: org.apache.lucene.index.MergePolicy, method name: findMerges
./org/apache/lucene/index/TestPerSegmentDeletes.java:257:    public MergeSpecification findMerges(MergeTrigger mergeTrigger, SegmentInfos segmentInfos, IndexWriter writer)
./org/apache/lucene/index/TestNoMergePolicy.java:36:    assertNull(mp.findMerges(null, (SegmentInfos)null, null));
./org/apache/lucene/index/TestOneMergeWrappingMergePolicy.java:51:    public MergePolicy.MergeSpecification findMerges(MergeTrigger mergeTrigger, SegmentInfos segmentInfos, IndexWriter writer)
./org/apache/lucene/index/TestOneMergeWrappingMergePolicy.java:95:      implTestSegmentsAreWrapped(msM, oneMergeWrappingMP.findMerges(null, null, null));
./org/apache/lucene/index/TestDemoParallelLeafReader.java:589:      public MergeSpecification findMerges(MergeTrigger mergeTrigger,
./org/apache/lucene/index/TestDemoParallelLeafReader.java:591:        return wrap(in.findMerges(mergeTrigger, segmentInfos, writer));

### Candidate class name: org.apache.lucene.search.spans.ConjunctionSpans, method name: collect
./org/apache/lucene/search/TestCachingCollector.java:52:    public void collect(int doc) throws IOException {}
./org/apache/lucene/search/TestCachingCollector.java:67:      // collect 1000 docs
./org/apache/lucene/search/TestCachingCollector.java:69:        acc.collect(i);
./org/apache/lucene/search/TestCachingCollector.java:77:        public void collect(int doc) {
./org/apache/lucene/search/TestCachingCollector.java:95:    // collect 130 docs, this should be enough for triggering cache abort.
./org/apache/lucene/search/TestCachingCollector.java:97:      acc.collect(i);
./org/apache/lucene/search/TestCachingCollector.java:119:      for (int i = 0; i < numDocs; i++) acc.collect(i);
./org/apache/lucene/search/TestCachingCollector.java:123:      acc.collect(numDocs);
./org/apache/lucene/search/TestCachingCollector.java:130:      // create w/ null wrapped collector, and test that the methods work
./org/apache/lucene/search/TestCachingCollector.java:134:      acc.collect(0);
./org/apache/lucene/search/MultiCollectorTest.java:34:    boolean collectCalled = false;
./org/apache/lucene/search/MultiCollectorTest.java:39:    public void collect(int doc) throws IOException {
./org/apache/lucene/search/MultiCollectorTest.java:40:      collectCalled = true;
./org/apache/lucene/search/MultiCollectorTest.java:61:    // Tests that the collector rejects all null collectors.
./org/apache/lucene/search/MultiCollectorTest.java:66:    // Tests that the collector handles some null collectors well. If it
./org/apache/lucene/search/MultiCollectorTest.java:71:    ac.collect(1);
./org/apache/lucene/search/MultiCollectorTest.java:86:    // Tests that the collector delegates calls to input collectors properly.
./org/apache/lucene/search/MultiCollectorTest.java:88:    // Tests that the collector handles some null collectors well. If it
./org/apache/lucene/search/MultiCollectorTest.java:93:    ac.collect(1);
./org/apache/lucene/search/MultiCollectorTest.java:98:      assertTrue(dc.collectCalled);
./org/apache/lucene/search/MultiCollectorTest.java:105:  private static Collector collector(boolean needsScores, Class<?> expectedScorer) {
./org/apache/lucene/search/MultiCollectorTest.java:118:          public void collect(int doc) throws IOException {}
./org/apache/lucene/search/MultiCollectorTest.java:142:      collector(false, ScoreCachingWrappingScorer.class).getLeafCollector(ctx).setScorer(new FakeScorer());
./org/apache/lucene/search/MultiCollectorTest.java:145:    // no collector needs scores => no caching
./org/apache/lucene/search/MultiCollectorTest.java:146:    Collector c1 = collector(false, FakeScorer.class);
./org/apache/lucene/search/MultiCollectorTest.java:147:    Collector c2 = collector(false, FakeScorer.class);
./org/apache/lucene/search/MultiCollectorTest.java:150:    // only one collector needs scores => no caching
./org/apache/lucene/search/MultiCollectorTest.java:151:    c1 = collector(true, FakeScorer.class);
./org/apache/lucene/search/MultiCollectorTest.java:152:    c2 = collector(false, FakeScorer.class);
./org/apache/lucene/search/MultiCollectorTest.java:155:    // several collectors need scores => caching
./org/apache/lucene/search/MultiCollectorTest.java:156:    c1 = collector(true, ScoreCachingWrappingScorer.class);
./org/apache/lucene/search/MultiCollectorTest.java:157:    c2 = collector(true, ScoreCachingWrappingScorer.class);
./org/apache/lucene/search/spans/JustCompileSearchSpans.java:68:    public void collect(SpanCollector collector) throws IOException {
./org/apache/lucene/search/spans/TestSpanCollection.java:80:    public void collectLeaf(PostingsEnum postings, int position, Term term) throws IOException {
./org/apache/lucene/search/spans/TestSpanCollection.java:98:  private void checkCollectedTerms(Spans spans, TermCollector collector, Term... expectedTerms) throws IOException {
./org/apache/lucene/search/spans/TestSpanCollection.java:99:    collector.reset();
./org/apache/lucene/search/spans/TestSpanCollection.java:100:    spans.collect(collector);
./org/apache/lucene/search/spans/TestSpanCollection.java:102:      assertTrue("Missing term " + t, collector.terms.contains(t));
./org/apache/lucene/search/spans/TestSpanCollection.java:104:    assertEquals("Unexpected terms found", expectedTerms.length, collector.terms.size());
./org/apache/lucene/search/spans/TestSpanCollection.java:121:    TermCollector collector = new TermCollector();

### Candidate class name: org.apache.lucene.search.similarities.Axiomatic, method name: gamma
Not in /lucene/core/src/test

### Candidate class name: org.apache.lucene.search.similarities.Similarity, method name: simScorer
./org/apache/lucene/index/TestIndexSorting.java:1885:    public SimScorer simScorer(SimWeight weight, LeafReaderContext context) throws IOException {
./org/apache/lucene/index/TestIndexSorting.java:1886:      return in.simScorer(weight, context);
./org/apache/lucene/index/TestNorms.java:186:    public SimScorer simScorer(SimWeight weight, LeafReaderContext context) throws IOException {
./org/apache/lucene/index/TestCustomNorms.java:110:    public SimScorer simScorer(SimWeight weight, LeafReaderContext context) throws IOException {
./org/apache/lucene/index/TestUniqueTermCount.java:113:    public SimScorer simScorer(SimWeight weight, LeafReaderContext context) throws IOException {
./org/apache/lucene/search/JustCompileSearch.java:202:    public SimScorer simScorer(SimWeight stats, LeafReaderContext context) {
./org/apache/lucene/search/TestConjunctions.java:112:    public SimScorer simScorer(SimWeight weight, LeafReaderContext context) throws IOException {
./org/apache/lucene/search/TestDocValuesScoring.java:151:    public SimScorer simScorer(SimWeight stats, LeafReaderContext context) throws IOException {
./org/apache/lucene/search/TestDocValuesScoring.java:152:      final SimScorer sub = sim.simScorer(stats, context);
./org/apache/lucene/search/TestMinShouldMatch2.java:346:          sims[(int)ord] = weight.similarity.simScorer(w, reader.getContext());
./org/apache/lucene/search/TestBooleanCoord.java:100:      public SimScorer simScorer(SimWeight weight, LeafReaderContext context) throws IOException {

## joda-time-2.10-original:
/home/daveroar/.m2/repository/org/joda/joda-convert/1.2/joda-convert-1.2.jar:/home/daveroar/.m2/repository/junit/junit/3.8.2/junit-3.8.2.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/joda-time-2.10-original-nojqf/target/classes/:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar

### Candidate class name: org.joda.time.chrono.AssembledChronology, method name: org.joda.time.Chronology withZone(org.joda.time.DateTimeZone)
$ find . -type f -print | xargs grep -n "withZone("
./org/joda/time/MockNullZoneChronology.java:34:    public Chronology withZone(DateTimeZone zone) {
./org/joda/time/TestTimeOfDay_Basics.java:653://        instant = base.getChronology().withZone(zone).set(base, instant);
./org/joda/time/TestTimeOfDay_Basics.java:714://        Chronology chrono = getChronology().withZone(zone);
./org/joda/time/TestDateTime_Basics.java:331:        public Chronology withZone(DateTimeZone zone) {
./org/joda/time/TestDateTime_Basics.java:790:        DateTime result = test.withZone(PARIS);
./org/joda/time/TestDateTime_Basics.java:795:        result = test.withZone(null);
./org/joda/time/TestDateTime_Basics.java:800:        result = test.withZone(null);
./org/joda/time/TestMutableDateTime_Basics.java:274:        public Chronology withZone(DateTimeZone zone) {
./org/joda/time/chrono/TestISOChronology.java:129:        assertSame(ISOChronology.getInstance(TOKYO), ISOChronology.getInstance(TOKYO).withZone(TOKYO));
./org/joda/time/chrono/TestISOChronology.java:130:        assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(LONDON));
./org/joda/time/chrono/TestISOChronology.java:131:        assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance(TOKYO).withZone(PARIS));
./org/joda/time/chrono/TestISOChronology.java:132:        assertSame(ISOChronology.getInstance(LONDON), ISOChronology.getInstance(TOKYO).withZone(null));
./org/joda/time/chrono/TestISOChronology.java:133:        assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstance().withZone(PARIS));
./org/joda/time/chrono/TestISOChronology.java:134:        assertSame(ISOChronology.getInstance(PARIS), ISOChronology.getInstanceUTC().withZone(PARIS));
./org/joda/time/chrono/TestBuddhistChronology.java:129:        assertSame(BuddhistChronology.getInstance(TOKYO), BuddhistChronology.getInstance(TOKYO).withZone(TOKYO));
./org/joda/time/chrono/TestBuddhistChronology.java:130:        assertSame(BuddhistChronology.getInstance(LONDON), BuddhistChronology.getInstance(TOKYO).withZone(LONDON));
./org/joda/time/chrono/TestBuddhistChronology.java:131:        assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstance(TOKYO).withZone(PARIS));
./org/joda/time/chrono/TestBuddhistChronology.java:132:        assertSame(BuddhistChronology.getInstance(LONDON), BuddhistChronology.getInstance(TOKYO).withZone(null));
./org/joda/time/chrono/TestBuddhistChronology.java:133:        assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstance().withZone(PARIS));
./org/joda/time/chrono/TestBuddhistChronology.java:134:        assertSame(BuddhistChronology.getInstance(PARIS), BuddhistChronology.getInstanceUTC().withZone(PARIS));
./org/joda/time/chrono/TestJulianChronology.java:135:        assertSame(JulianChronology.getInstance(TOKYO), JulianChronology.getInstance(TOKYO).withZone(TOKYO));
./org/joda/time/chrono/TestJulianChronology.java:136:        assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(LONDON));
./org/joda/time/chrono/TestJulianChronology.java:137:        assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstance(TOKYO).withZone(PARIS));
./org/joda/time/chrono/TestJulianChronology.java:138:        assertSame(JulianChronology.getInstance(LONDON), JulianChronology.getInstance(TOKYO).withZone(null));
./org/joda/time/chrono/TestJulianChronology.java:139:        assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstance().withZone(PARIS));
./org/joda/time/chrono/TestJulianChronology.java:140:        assertSame(JulianChronology.getInstance(PARIS), JulianChronology.getInstanceUTC().withZone(PARIS));
./org/joda/time/chrono/TestGregorianChronology.java:138:        assertSame(GregorianChronology.getInstance(TOKYO), GregorianChronology.getInstance(TOKYO).withZone(TOKYO));
./org/joda/time/chrono/TestGregorianChronology.java:139:        assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(TOKYO).withZone(LONDON));
./org/joda/time/chrono/TestGregorianChronology.java:140:        assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance(TOKYO).withZone(PARIS));
./org/joda/time/chrono/TestGregorianChronology.java:141:        assertSame(GregorianChronology.getInstance(LONDON), GregorianChronology.getInstance(TOKYO).withZone(null));
./org/joda/time/chrono/TestGregorianChronology.java:142:        assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstance().withZone(PARIS));
./org/joda/time/chrono/TestGregorianChronology.java:143:        assertSame(GregorianChronology.getInstance(PARIS), GregorianChronology.getInstanceUTC().withZone(PARIS));
./org/joda/time/chrono/TestIslamicChronology.java:129:        assertSame(IslamicChronology.getInstance(TOKYO), IslamicChronology.getInstance(TOKYO).withZone(TOKYO));
./org/joda/time/chrono/TestIslamicChronology.java:130:        assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(LONDON));
./org/joda/time/chrono/TestIslamicChronology.java:131:        assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance(TOKYO).withZone(PARIS));
./org/joda/time/chrono/TestIslamicChronology.java:132:        assertSame(IslamicChronology.getInstance(LONDON), IslamicChronology.getInstance(TOKYO).withZone(null));
./org/joda/time/chrono/TestIslamicChronology.java:133:        assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstance().withZone(PARIS));
./org/joda/time/chrono/TestIslamicChronology.java:134:        assertSame(IslamicChronology.getInstance(PARIS), IslamicChronology.getInstanceUTC().withZone(PARIS));
./org/joda/time/chrono/TestGJChronology.java:181:        assertSame(GJChronology.getInstance(TOKYO), GJChronology.getInstance(TOKYO).withZone(TOKYO));
./org/joda/time/chrono/TestGJChronology.java:182:        assertSame(GJChronology.getInstance(LONDON), GJChronology.getInstance(TOKYO).withZone(LONDON));
./org/joda/time/chrono/TestGJChronology.java:183:        assertSame(GJChronology.getInstance(PARIS), GJChronology.getInstance(TOKYO).withZone(PARIS));
./org/joda/time/chrono/TestGJChronology.java:184:        assertSame(GJChronology.getInstance(LONDON), GJChronology.getInstance(TOKYO).withZone(null));
./org/joda/time/chrono/TestGJChronology.java:185:        assertSame(GJChronology.getInstance(PARIS), GJChronology.getInstance().withZone(PARIS));
./org/joda/time/chrono/TestGJChronology.java:186:        assertSame(GJChronology.getInstance(PARIS), GJChronology.getInstanceUTC().withZone(PARIS));
./org/joda/time/chrono/TestCopticChronology.java:132:        assertSame(CopticChronology.getInstance(TOKYO), CopticChronology.getInstance(TOKYO).withZone(TOKYO));
./org/joda/time/chrono/TestCopticChronology.java:133:        assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(LONDON));
./org/joda/time/chrono/TestCopticChronology.java:134:        assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance(TOKYO).withZone(PARIS));
./org/joda/time/chrono/TestCopticChronology.java:135:        assertSame(CopticChronology.getInstance(LONDON), CopticChronology.getInstance(TOKYO).withZone(null));
./org/joda/time/chrono/TestCopticChronology.java:136:        assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstance().withZone(PARIS));
./org/joda/time/chrono/TestCopticChronology.java:137:        assertSame(CopticChronology.getInstance(PARIS), CopticChronology.getInstanceUTC().withZone(PARIS));
./org/joda/time/chrono/gj/TestGJChronology.java:105:    public Chronology withZone(DateTimeZone zone) {
./org/joda/time/chrono/TestEthiopicChronology.java:132:        assertSame(EthiopicChronology.getInstance(TOKYO), EthiopicChronology.getInstance(TOKYO).withZone(TOKYO));
./org/joda/time/chrono/TestEthiopicChronology.java:133:        assertSame(EthiopicChronology.getInstance(LONDON), EthiopicChronology.getInstance(TOKYO).withZone(LONDON));
./org/joda/time/chrono/TestEthiopicChronology.java:134:        assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstance(TOKYO).withZone(PARIS));
./org/joda/time/chrono/TestEthiopicChronology.java:135:        assertSame(EthiopicChronology.getInstance(LONDON), EthiopicChronology.getInstance(TOKYO).withZone(null));
./org/joda/time/chrono/TestEthiopicChronology.java:136:        assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstance().withZone(PARIS));
./org/joda/time/chrono/TestEthiopicChronology.java:137:        assertSame(EthiopicChronology.getInstance(PARIS), EthiopicChronology.getInstanceUTC().withZone(PARIS));
./org/joda/time/format/TestDateTimeFormatter.java:116:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestDateTimeFormatter.java:119:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormatter.java:136:        assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(NEWYORK).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:137:        assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withZone(PARIS).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:138:        assertEquals("Wed 2004-06-09T10:20:30Z", f.withZone(null).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:140:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormatter.java:141:        assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(NEWYORK).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:142:        assertEquals("Wed 2004-06-09T12:20:30+02:00", f.withZone(PARIS).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:144:        assertEquals("Wed 2004-06-09T06:20:30-04:00", f.withZone(null).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:256:                f.withChronology(null).withZone(null).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:258:                f.withChronology(ISO_PARIS).withZone(null).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:260:                f.withChronology(ISO_PARIS).withZone(PARIS).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:262:                f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:264:                f.withChronology(null).withZone(NEWYORK).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:268:                f.withChronology(null).withZone(null).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:270:                f.withChronology(ISO_PARIS).withZone(null).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:272:                f.withChronology(ISO_PARIS).withZone(PARIS).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:274:                f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:276:                f.withChronology(null).withZone(NEWYORK).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:280:                f.withChronology(null).withZone(null).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:282:                f.withChronology(ISO_PARIS).withZone(null).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:284:                f.withChronology(ISO_PARIS).withZone(PARIS).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:286:                f.withChronology(ISO_PARIS).withZone(NEWYORK).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:288:                f.withChronology(null).withZone(NEWYORK).print(dt));
./org/joda/time/format/TestDateTimeFormatter.java:302:        DateTimeFormatter f2 = f.withZone(PARIS);
./org/joda/time/format/TestDateTimeFormatter.java:304:        assertSame(f2, f2.withZone(PARIS));
./org/joda/time/format/TestDateTimeFormatter.java:306:        f2 = f.withZone(null);
./org/joda/time/format/TestDateTimeFormatter.java:308:        assertSame(f2, f2.withZone(null));
./org/joda/time/format/TestDateTimeFormatter.java:344:        f2 = f2.withZone(PARIS);
./org/joda/time/format/TestDateTimeFormatter.java:582:        assertEquals(expect, g.withZone(LONDON).parseDateTime("2004-06-09T10:20:30Z"));
./org/joda/time/format/TestDateTimeFormatter.java:585:        assertEquals(expect, g.withZone(null).parseDateTime("2004-06-09T10:20:30Z"));
./org/joda/time/format/TestDateTimeFormatter.java:588:        assertEquals(expect, g.withZone(PARIS).parseDateTime("2004-06-09T10:20:30Z"));
./org/joda/time/format/TestDateTimeFormatter.java:594:        assertEquals(expect, g.withZone(LONDON).parseDateTime("2004-06-09T06:20:30-04:00"));
./org/joda/time/format/TestDateTimeFormatter.java:597:        assertEquals(expect, g.withZone(null).parseDateTime("2004-06-09T06:20:30-04:00"));
./org/joda/time/format/TestDateTimeFormatter.java:600:        assertEquals(expect, g.withZone(PARIS).parseDateTime("2004-06-09T06:20:30-04:00"));
./org/joda/time/format/TestDateTimeFormatter.java:612:        assertEquals(expect, h.withZone(LONDON).parseDateTime("2004-06-09T10:20:30"));
./org/joda/time/format/TestDateTimeFormatter.java:615:        assertEquals(expect, h.withZone(null).parseDateTime("2004-06-09T10:20:30"));
./org/joda/time/format/TestDateTimeFormatter.java:618:        assertEquals(expect, h.withZone(PARIS).parseDateTime("2004-06-09T10:20:30"));
./org/joda/time/format/TestDateTimeFormatter.java:642:        assertEquals(expect, g.withZone(PARIS).withOffsetParsed().parseDateTime("2004-06-09T10:20:30Z"));
./org/joda/time/format/TestDateTimeFormatter.java:644:        assertEquals(expect, g.withOffsetParsed().withZone(PARIS).parseDateTime("2004-06-09T10:20:30Z"));
./org/joda/time/format/TestDateTimeFormatter.java:677:        assertEquals(expect, g.withZone(LONDON).parseMutableDateTime("2004-06-09T10:20:30Z"));
./org/joda/time/format/TestDateTimeFormatter.java:680:        assertEquals(expect, g.withZone(null).parseMutableDateTime("2004-06-09T10:20:30Z"));
./org/joda/time/format/TestDateTimeFormatter.java:683:        assertEquals(expect, g.withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30Z"));
./org/joda/time/format/TestDateTimeFormatter.java:689:        assertEquals(expect, g.withZone(LONDON).parseMutableDateTime("2004-06-09T06:20:30-04:00"));
./org/joda/time/format/TestDateTimeFormatter.java:692:        assertEquals(expect, g.withZone(null).parseMutableDateTime("2004-06-09T06:20:30-04:00"));
./org/joda/time/format/TestDateTimeFormatter.java:695:        assertEquals(expect, g.withZone(PARIS).parseMutableDateTime("2004-06-09T06:20:30-04:00"));
./org/joda/time/format/TestDateTimeFormatter.java:707:        assertEquals(expect, h.withZone(LONDON).parseMutableDateTime("2004-06-09T10:20:30"));
./org/joda/time/format/TestDateTimeFormatter.java:710:        assertEquals(expect, h.withZone(null).parseMutableDateTime("2004-06-09T10:20:30"));
./org/joda/time/format/TestDateTimeFormatter.java:713:        assertEquals(expect, h.withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30"));
./org/joda/time/format/TestDateTimeFormatter.java:737:        assertEquals(expect, g.withZone(PARIS).withOffsetParsed().parseMutableDateTime("2004-06-09T10:20:30Z"));
./org/joda/time/format/TestDateTimeFormatter.java:739:        assertEquals(expect, g.withOffsetParsed().withZone(PARIS).parseMutableDateTime("2004-06-09T10:20:30Z"));
./org/joda/time/format/TestDateTimeFormatter.java:780:        assertEquals(20, g.withZone(LONDON).parseInto(result, "2004-06-09T10:20:30Z", 0));
./org/joda/time/format/TestDateTimeFormatter.java:785:        assertEquals(20, g.withZone(null).parseInto(result, "2004-06-09T10:20:30Z", 0));
./org/joda/time/format/TestDateTimeFormatter.java:790:        assertEquals(20, g.withZone(PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0));
./org/joda/time/format/TestDateTimeFormatter.java:799:        assertEquals(25, g.withZone(LONDON).parseInto(result, "2004-06-09T06:20:30-04:00", 0));
./org/joda/time/format/TestDateTimeFormatter.java:803:        assertEquals(25, g.withZone(null).parseInto(result, "2004-06-09T06:20:30-04:00", 0));
./org/joda/time/format/TestDateTimeFormatter.java:807:        assertEquals(25, g.withZone(PARIS).parseInto(result, "2004-06-09T06:20:30-04:00", 0));
./org/joda/time/format/TestDateTimeFormatter.java:822:        assertEquals(19, h.withZone(LONDON).parseInto(result, "2004-06-09T10:20:30", 0));
./org/joda/time/format/TestDateTimeFormatter.java:827:        assertEquals(19, h.withZone(null).parseInto(result, "2004-06-09T10:20:30", 0));
./org/joda/time/format/TestDateTimeFormatter.java:832:        assertEquals(19, h.withZone(PARIS).parseInto(result, "2004-06-09T10:20:30", 0));
./org/joda/time/format/TestDateTimeFormatter.java:861:        assertEquals(20, g.withZone(PARIS).withOffsetParsed().parseInto(result, "2004-06-09T10:20:30Z", 0));
./org/joda/time/format/TestDateTimeFormatter.java:865:        assertEquals(20, g.withOffsetParsed().withZone(PARIS).parseInto(result, "2004-06-09T10:20:30Z", 0));
./org/joda/time/format/TestISODateTimeFormat.java:100:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:103:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:118:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:121:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:137:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:140:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:156:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:159:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:167:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:170:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:178:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:181:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:184://        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:187://        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:201:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:204:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:212:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:215:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:223:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:226:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:234:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:237:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:245:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:248:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:256:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:259:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:267:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:270:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:279:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:282:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:290:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:293:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:301:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:304:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:312:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:315:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:323:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:326:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:334:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:337:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:345:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:348:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:356:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:359:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:367:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:370:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:378:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:381:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:389:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:392:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:400:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:403:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:411:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:414:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:423:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:426:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:434:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:437:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:445:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:448:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:456:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:459:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:467:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:470:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:478:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:481:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:490:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:493:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:501:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:504:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:512:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:515:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:523:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:526:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:534:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:537:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:546:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:549:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:557:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:560:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:568:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:571:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:579:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:582:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestISODateTimeFormat.java:590:        dt = dt.withZone(LONDON);
./org/joda/time/format/TestISODateTimeFormat.java:593:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestDateTimeFormatterBuilder.java:585:        assertEquals(dt.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +09:00"));
./org/joda/time/format/TestDateTimeFormatterBuilder.java:586:        assertEquals(dt, f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +09:00"));
./org/joda/time/format/TestDateTimeFormatterBuilder.java:587:        assertEquals(dt.withZone(DateTimeZone.forOffsetHours(9)), f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +09:00"));
./org/joda/time/format/TestDateTimeFormatterBuilder.java:597:        assertEquals(dt, f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
./org/joda/time/format/TestDateTimeFormatterBuilder.java:598:        assertEquals(dt.withZone(PARIS), f.withZone(PARIS).parseDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
./org/joda/time/format/TestDateTimeFormatterBuilder.java:599:        assertEquals(dt.withZone(DateTimeZone.forOffsetHours(9)), f.withOffsetParsed().parseDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
./org/joda/time/format/TestDateTimeFormatterBuilder.java:609:        assertEquals(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00"));
./org/joda/time/format/TestDateTimeFormatterBuilder.java:613:        assertEquals(expected.withZone(DateTimeZone.getDefault()), f.parseDateTime("2007-03-04 12:30 +07:00"));
./org/joda/time/format/TestDateTimeFormatterBuilder.java:623:        assertEquals(expected.withZone(TOKYO), f.parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
./org/joda/time/format/TestDateTimeFormatterBuilder.java:625:        assertEquals(expected.withZone(TOKYO), f.withZone(TOKYO).parseDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
./org/joda/time/format/TestDateTimeFormatterBuilder.java:653:        assertEquals(expected, f.withZone(TOKYO).parseLocalDateTime("2007-03-04 12:30 +09:00"));
./org/joda/time/format/TestDateTimeFormatterBuilder.java:666:        assertEquals(expected, f.withZone(TOKYO).parseLocalDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
./org/joda/time/format/TestDateTimeFormatterBuilder.java:667:        assertEquals(expected, f.withZone(PARIS).parseLocalDateTime("2007-03-04 12:30 +09:00 Asia/Tokyo"));
./org/joda/time/format/TestDateTimeFormatterBuilder.java:679:        assertEquals(expected, f.withZone(TOKYO).parseLocalDateTime("2007-03-04 12:30 +07:00 Asia/Tokyo"));
./org/joda/time/format/TestDateTimeFormat.java:106:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:109:        dt = dt.withZone(PARIS);
./org/joda/time/format/TestDateTimeFormat.java:119:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:122:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:135:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:138:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:216:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:219:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:372:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:375:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:503:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:506:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:516:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:519:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:529:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:532:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:545:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:548:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:561:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:564:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:574:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:577:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:587:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:590:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:603:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:606:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:619:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:622:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:632:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:635:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:645:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:648:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:661:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:664:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:677:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:680:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:693:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:696:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:709:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:712:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:722:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:725:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:735:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:738:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:748:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:751:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:761:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:764:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:773:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:776:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:786:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:789:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:798:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:801:        dt = dt.withZone(TOKYO);
./org/joda/time/format/TestDateTimeFormat.java:810:        dt = dt.withZone(NEWYORK);
./org/joda/time/format/TestDateTimeFormat.java:813:        dt = dt.withZone(TOKYO);
./org/joda/time/convert/TestStringConverter.java:533:        assertEquals(new DateTime(2003, 8, 9, 0, 0, 0, 0, BuddhistChronology.getInstance(SIX)).withZone(EIGHT), m.getStart());
./org/joda/time/convert/TestStringConverter.java:534:        assertEquals(new DateTime(2004, 6, 9, 0, 0, 0, 0, BuddhistChronology.getInstance(SEVEN)).withZone(EIGHT), m.getEnd());
./org/joda/time/convert/MockBadChronology.java:33:    public Chronology withZone(DateTimeZone zone) {


### Candidate class name: org.joda.time.DateTimeField, method name: getDifferenceAsLong
./joda/time/TestDateTime_Properties.java:1114:        assertEquals(-2L, test1.hourOfDay().getDifferenceAsLong(test2));
./joda/time/TestDateTime_Properties.java:1115:        assertEquals(2L, test2.hourOfDay().getDifferenceAsLong(test1));
./joda/time/TestDateTime_Properties.java:1119:        assertEquals(13L, test.hourOfDay().getDifferenceAsLong(null));
./joda/time/TestDateMidnight_Properties.java:303:        assertEquals(-2L, test1.monthOfYear().getDifferenceAsLong(test2));
./joda/time/TestDateMidnight_Properties.java:304:        assertEquals(2L, test2.monthOfYear().getDifferenceAsLong(test1));
./joda/time/field/TestPreciseDateTimeField.java:295:    public void test_getDifferenceAsLong_long_long() {
./joda/time/field/TestPreciseDateTimeField.java:298:        assertEquals(30, field.getDifferenceAsLong(0L, 0L));
./joda/time/field/TestPreciseDateTimeField.java:592:        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
./joda/time/field/TestPreciseDateTimeField.java:624:        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
./joda/time/field/TestPreciseDateTimeField.java:655:        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
./joda/time/field/TestOffsetDateTimeField.java:295:    public void test_getDifferenceAsLong_long_long() {
./joda/time/field/TestOffsetDateTimeField.java:297:        assertEquals(-21L, field.getDifferenceAsLong(20000L, 41000L));
./joda/time/field/TestPreciseDurationField.java:205:    public void test_getDifferenceAsLong_long_long() {
./joda/time/field/TestPreciseDurationField.java:206:        assertEquals(0L, iField.getDifferenceAsLong(1L, 0L));
./joda/time/field/TestPreciseDurationField.java:207:        assertEquals(567L, iField.getDifferenceAsLong(567000L, 0L));
./joda/time/field/TestPreciseDurationField.java:208:        assertEquals(567L - 1234L, iField.getDifferenceAsLong(567000L, 1234000L));
./joda/time/field/TestPreciseDurationField.java:209:        assertEquals(567L + 1234L, iField.getDifferenceAsLong(567000L, -1234000L));
./joda/time/field/TestPreciseDurationField.java:211:            iField.getDifferenceAsLong(LONG_MAX, -1L);
./joda/time/field/TestScaledDurationField.java:222:    public void test_getDifferenceAsLong_long_long() {
./joda/time/field/TestScaledDurationField.java:223:        assertEquals(0L, iField.getDifferenceAsLong(1L, 0L));
./joda/time/field/TestScaledDurationField.java:224:        assertEquals(567L, iField.getDifferenceAsLong(567L * 90L, 0L));
./joda/time/field/TestScaledDurationField.java:225:        assertEquals(567L - 1234L, iField.getDifferenceAsLong(567L * 90L, 1234L * 90L));
./joda/time/field/TestScaledDurationField.java:226:        assertEquals(567L + 1234L, iField.getDifferenceAsLong(567L * 90L, -1234L * 90L));
./joda/time/field/TestScaledDurationField.java:228:            iField.getDifferenceAsLong(LONG_MAX, -1L);
./joda/time/field/TestMillisDurationField.java:172:    public void test_getDifferenceAsLong_long_long() {
./joda/time/field/TestMillisDurationField.java:173:        assertEquals(567L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, 0L));
./joda/time/field/TestMillisDurationField.java:174:        assertEquals(567L - 1234L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, 1234L));
./joda/time/field/TestMillisDurationField.java:175:        assertEquals(567L + 1234L, MillisDurationField.INSTANCE.getDifferenceAsLong(567L, -1234L));
./joda/time/field/TestMillisDurationField.java:177:            MillisDurationField.INSTANCE.getDifferenceAsLong(Long.MAX_VALUE, -1L);
./joda/time/field/TestPreciseDurationDateTimeField.java:266:    public void test_getDifferenceAsLong_long_long() {
./joda/time/field/TestPreciseDurationDateTimeField.java:269:        assertEquals(30, field.getDifferenceAsLong(0L, 0L));
./joda/time/field/TestPreciseDurationDateTimeField.java:596:        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
./joda/time/field/TestPreciseDurationDateTimeField.java:628:        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
./joda/time/field/TestPreciseDurationDateTimeField.java:659:        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {
./joda/time/field/TestUnsupportedDateTimeField.java:621:        // UnsupportedDateTimeField.getDifferenceAsLong(long minuendInstant,
./joda/time/field/TestUnsupportedDateTimeField.java:627:            fieldOne.getDifferenceAsLong(100000L, 1000L);
./joda/time/field/TestBaseDateTimeField.java:261:    public void test_getDifferenceAsLong_long_long() {
./joda/time/field/TestBaseDateTimeField.java:264:        assertEquals(30, field.getDifferenceAsLong(0L, 0L));
./joda/time/field/TestBaseDateTimeField.java:595:        public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) {

### Candidate class name: org.joda.time.DateTimeField, method name: add
./joda/time/field/TestPreciseDateTimeField.java:205:        assertEquals(61, field.add(1L, 1));
./joda/time/field/TestPreciseDateTimeField.java:212:        assertEquals(61, field.add(1L, 1L));
./joda/time/field/TestPreciseDateTimeField.java:220:        int[] result = field.add(new TimeOfDay(), 2, values, 0);
./joda/time/field/TestPreciseDateTimeField.java:225:        result = field.add(new TimeOfDay(), 2, values, 1);
./joda/time/field/TestPreciseDateTimeField.java:230:        result = field.add(new TimeOfDay(), 2, values, 30);
./joda/time/field/TestPreciseDateTimeField.java:235:            field.add(new TimeOfDay(), 2, values, 30);
./joda/time/field/TestPreciseDateTimeField.java:241:        result = field.add(new TimeOfDay(), 2, values, -1);
./joda/time/field/TestPreciseDateTimeField.java:246:        result = field.add(new TimeOfDay(), 2, values, -31);
./joda/time/field/TestPreciseDateTimeField.java:251:            field.add(new TimeOfDay(), 2, values, -31);
./joda/time/field/TestPreciseDateTimeField.java:584:        public long add(long instant, int value) {
./joda/time/field/TestPreciseDateTimeField.java:588:        public long add(long instant, long value) {
./joda/time/field/TestPreciseDateTimeField.java:618:        public long add(long instant, int value) {
./joda/time/field/TestPreciseDateTimeField.java:621:        public long add(long instant, long value) {
./joda/time/field/TestPreciseDateTimeField.java:649:        public long add(long instant, int value) {
./joda/time/field/TestPreciseDateTimeField.java:652:        public long add(long instant, long value) {
./joda/time/field/TestOffsetDateTimeField.java:210:        assertEquals(1001, field.add(1L, 1));
./joda/time/field/TestOffsetDateTimeField.java:215:        assertEquals(1001, field.add(1L, 1L));
./joda/time/field/TestOffsetDateTimeField.java:222:        int[] result = field.add(new TimeOfDay(), 2, values, 0);
./joda/time/field/TestOffsetDateTimeField.java:227:        result = field.add(new TimeOfDay(), 2, values, 1);
./joda/time/field/TestOffsetDateTimeField.java:232:        result = field.add(new TimeOfDay(), 2, values, 32);
./joda/time/field/TestOffsetDateTimeField.java:237:        result = field.add(new TimeOfDay(), 2, values, 33);
./joda/time/field/TestOffsetDateTimeField.java:242:            field.add(new TimeOfDay(), 2, values, 33);
./joda/time/field/TestOffsetDateTimeField.java:248:        result = field.add(new TimeOfDay(), 2, values, -1);
./joda/time/field/TestOffsetDateTimeField.java:253:        result = field.add(new TimeOfDay(), 2, values, -31);
./joda/time/field/TestOffsetDateTimeField.java:258:            field.add(new TimeOfDay(), 2, values, -31);
./joda/time/field/TestPreciseDurationField.java:170:        assertEquals(567L, iField.add(567L, 0));
./joda/time/field/TestPreciseDurationField.java:171:        assertEquals(567L + 1234000L, iField.add(567L, 1234));
./joda/time/field/TestPreciseDurationField.java:172:        assertEquals(567L - 1234000L, iField.add(567L, -1234));
./joda/time/field/TestPreciseDurationField.java:174:            iField.add(LONG_MAX, 1);
./joda/time/field/TestPreciseDurationField.java:180:        assertEquals(567L, iField.add(567L, 0L));
./joda/time/field/TestPreciseDurationField.java:181:        assertEquals(567L + 1234000L, iField.add(567L, 1234L));
./joda/time/field/TestPreciseDurationField.java:182:        assertEquals(567L - 1234000L, iField.add(567L, -1234L));
./joda/time/field/TestPreciseDurationField.java:184:            iField.add(LONG_MAX, 1L);
./joda/time/field/TestPreciseDurationField.java:188:            iField.add(1L, LONG_MAX);
./joda/time/field/TestScaledDurationField.java:187:        assertEquals(567L, iField.add(567L, 0));
./joda/time/field/TestScaledDurationField.java:188:        assertEquals(567L + 1234L * 90L, iField.add(567L, 1234));
./joda/time/field/TestScaledDurationField.java:189:        assertEquals(567L - 1234L * 90L, iField.add(567L, -1234));
./joda/time/field/TestScaledDurationField.java:191:            iField.add(LONG_MAX, 1);
./joda/time/field/TestScaledDurationField.java:197:        assertEquals(567L, iField.add(567L, 0L));
./joda/time/field/TestScaledDurationField.java:198:        assertEquals(567L + 1234L * 90L, iField.add(567L, 1234L));
./joda/time/field/TestScaledDurationField.java:199:        assertEquals(567L - 1234L * 90L, iField.add(567L, -1234L));
./joda/time/field/TestScaledDurationField.java:201:            iField.add(LONG_MAX, 1L);
./joda/time/field/TestScaledDurationField.java:205:            iField.add(1L, LONG_MAX);
./joda/time/field/TestMillisDurationField.java:142:        assertEquals(567L, MillisDurationField.INSTANCE.add(567L, 0));
./joda/time/field/TestMillisDurationField.java:143:        assertEquals(567L + 1234L, MillisDurationField.INSTANCE.add(567L, 1234));
./joda/time/field/TestMillisDurationField.java:144:        assertEquals(567L - 1234L, MillisDurationField.INSTANCE.add(567L, -1234));
./joda/time/field/TestMillisDurationField.java:146:            MillisDurationField.INSTANCE.add(Long.MAX_VALUE, 1);
./joda/time/field/TestMillisDurationField.java:152:        assertEquals(567L, MillisDurationField.INSTANCE.add(567L, 0L));
./joda/time/field/TestMillisDurationField.java:153:        assertEquals(567L + 1234L, MillisDurationField.INSTANCE.add(567L, 1234L));
./joda/time/field/TestMillisDurationField.java:154:        assertEquals(567L - 1234L, MillisDurationField.INSTANCE.add(567L, -1234L));
./joda/time/field/TestMillisDurationField.java:156:            MillisDurationField.INSTANCE.add(Long.MAX_VALUE, 1L);
./joda/time/field/TestPreciseDurationDateTimeField.java:176:        assertEquals(61, field.add(1L, 1));
./joda/time/field/TestPreciseDurationDateTimeField.java:183:        assertEquals(61, field.add(1L, 1L));
./joda/time/field/TestPreciseDurationDateTimeField.java:191:        int[] result = field.add(new TimeOfDay(), 2, values, 0);
./joda/time/field/TestPreciseDurationDateTimeField.java:196:        result = field.add(new TimeOfDay(), 2, values, 1);
./joda/time/field/TestPreciseDurationDateTimeField.java:201:        result = field.add(new TimeOfDay(), 2, values, 30);
./joda/time/field/TestPreciseDurationDateTimeField.java:206:            field.add(new TimeOfDay(), 2, values, 30);
./joda/time/field/TestPreciseDurationDateTimeField.java:212:        result = field.add(new TimeOfDay(), 2, values, -1);
./joda/time/field/TestPreciseDurationDateTimeField.java:217:        result = field.add(new TimeOfDay(), 2, values, -31);
./joda/time/field/TestPreciseDurationDateTimeField.java:222:            field.add(new TimeOfDay(), 2, values, -31);
./joda/time/field/TestPreciseDurationDateTimeField.java:588:        public long add(long instant, int value) {
./joda/time/field/TestPreciseDurationDateTimeField.java:592:        public long add(long instant, long value) {
./joda/time/field/TestPreciseDurationDateTimeField.java:622:        public long add(long instant, int value) {
./joda/time/field/TestPreciseDurationDateTimeField.java:625:        public long add(long instant, long value) {
./joda/time/field/TestPreciseDurationDateTimeField.java:653:        public long add(long instant, int value) {
./joda/time/field/TestPreciseDurationDateTimeField.java:656:        public long add(long instant, long value) {
./joda/time/field/TestUnsupportedDateTimeField.java:148:     * method correctly throws this exception. * add(ReadablePartial instant,
./joda/time/field/TestUnsupportedDateTimeField.java:181:        // add(ReadablePartial instant, int fieldIndex, int[] values, int
./joda/time/field/TestUnsupportedDateTimeField.java:184:            fieldOne.add(localTime, 0, new int[] { 0, 100 }, 100);
./joda/time/field/TestUnsupportedDateTimeField.java:557:        // UnsupportedDateTimeField.add(long instant, int value) should
./joda/time/field/TestUnsupportedDateTimeField.java:563:            fieldOne.add(System.currentTimeMillis(), 100);
./joda/time/field/TestUnsupportedDateTimeField.java:570:            long firstComputation = hoursDuration.add(currentTime, 100);
./joda/time/field/TestUnsupportedDateTimeField.java:571:            long secondComputation = fieldTwo.add(currentTime,
./joda/time/field/TestUnsupportedDateTimeField.java:578:        // UnsupportedDateTimeField.add(long instant, long value) should
./joda/time/field/TestUnsupportedDateTimeField.java:584:            fieldOne.add(System.currentTimeMillis(), 1000L);
./joda/time/field/TestUnsupportedDateTimeField.java:592:            long firstComputation = hoursDuration.add(currentTime, 1000L);
./joda/time/field/TestUnsupportedDateTimeField.java:593:            long secondComputation = fieldTwo.add(currentTime,
./joda/time/field/TestBaseDateTimeField.java:159:        assertEquals(61, field.add(1L, 1));
./joda/time/field/TestBaseDateTimeField.java:166:        assertEquals(61, field.add(1L, 1L));
./joda/time/field/TestBaseDateTimeField.java:174:        int[] result = field.add(new TimeOfDay(), 2, values, 0);
./joda/time/field/TestBaseDateTimeField.java:179:        result = field.add(new TimeOfDay(), 2, values, 1);
./joda/time/field/TestBaseDateTimeField.java:184:        result = field.add(new TimeOfDay(), 2, values, 30);
./joda/time/field/TestBaseDateTimeField.java:189:            field.add(new TimeOfDay(), 2, values, 30);
./joda/time/field/TestBaseDateTimeField.java:195:        result = field.add(new TimeOfDay(), 2, values, -1);
./joda/time/field/TestBaseDateTimeField.java:200:        result = field.add(new TimeOfDay(), 2, values, -31);
./joda/time/field/TestBaseDateTimeField.java:205:            field.add(new TimeOfDay(), 2, values, -31);
./joda/time/field/TestBaseDateTimeField.java:211:            field.add(new MockPartial(), 0, values, 1000);
./joda/time/field/TestBaseDateTimeField.java:217:            field.add(new MockPartial(), 0, values, -1000);
./joda/time/field/TestBaseDateTimeField.java:587:        public long add(long instant, int value) {
./joda/time/field/TestBaseDateTimeField.java:591:        public long add(long instant, long value) {
./joda/time/TestDateTimeUtils.java:96:                p.add(new AllPermission());  // enable everything
./joda/time/TestDateTimeUtils.java:112:                p.add(new AllPermission());  // enable everything
./joda/time/TestMutableDateTime_Adds.java:108:        test.add(123456L);
./joda/time/TestMutableDateTime_Adds.java:116:        test.add(new Duration(123456L));
./joda/time/TestMutableDateTime_Adds.java:122:        test.add((ReadableDuration) null);
./joda/time/TestMutableDateTime_Adds.java:129:        test.add(new Duration(123456L), -2);
./joda/time/TestMutableDateTime_Adds.java:135:        test.add((ReadableDuration) null, 1);
./joda/time/TestMutableDateTime_Adds.java:144:        test.add(d);
./joda/time/TestMutableDateTime_Adds.java:150:        test.add((ReadablePeriod) null);
./joda/time/TestMutableDateTime_Adds.java:158:        test.add(d, -2);
./joda/time/TestMutableDateTime_Adds.java:164:        test.add((ReadablePeriod) null, 1);
./joda/time/TestMutableDateTime_Adds.java:171:        test.add(DurationFieldType.years(), 8);
./joda/time/TestMutableDateTime_Adds.java:178:        test.add(DurationFieldType.years(), 0);
./joda/time/TestMutableDateTime_Adds.java:186:        test.add(DurationFieldType.years(), 0);
./joda/time/TestMutableDateTime_Adds.java:193:            test.add((DurationFieldType) null, 0);
./joda/time/TestMutableDateTime_Adds.java:202:            test.add((DurationFieldType) null, 6);
./joda/time/convert/MockUnknownCalendar.java:49:    public void add(int field, int amount) {
./joda/time/convert/TestConverterSet.java:119:        ConverterSet result = set.add(c5, null);
./joda/time/convert/TestConverterSet.java:129:        ConverterSet result = set.add(c4, null);
./joda/time/convert/TestConverterSet.java:138:        ConverterSet result = set.add(c4a, null);
./joda/time/convert/TestConverterManager.java:81:                p.add(new AllPermission());  // enable everything
./joda/time/convert/TestConverterManager.java:97:                p.add(new AllPermission());  // enable everything

### Candidate class name: org.joda.time.field.BaseDateTimeField, method name: set
./joda/time/field/TestBaseDateTimeField.java:271:        assertEquals(1000, field.set(0L, 0));
./joda/time/field/TestBaseDateTimeField.java:272:        assertEquals(1029, field.set(0L, 29));
./joda/time/field/TestBaseDateTimeField.java:279:        int[] result = field.set(new TimeOfDay(), 2, values, 30);
./joda/time/field/TestBaseDateTimeField.java:284:        result = field.set(new TimeOfDay(), 2, values, 29);
./joda/time/field/TestBaseDateTimeField.java:290:            field.set(new TimeOfDay(), 2, values, 60);
./joda/time/field/TestBaseDateTimeField.java:298:            field.set(new TimeOfDay(), 2, values, -1);
./joda/time/field/TestBaseDateTimeField.java:306:        assertEquals(1000, field.set(0L, "0", null));
./joda/time/field/TestBaseDateTimeField.java:307:        assertEquals(1029, field.set(0L, "29", Locale.ENGLISH));
./joda/time/field/TestBaseDateTimeField.java:312:        assertEquals(1000, field.set(0L, "0"));
./joda/time/field/TestBaseDateTimeField.java:313:        assertEquals(1029, field.set(0L, "29"));
./joda/time/field/TestBaseDateTimeField.java:320:        int[] result = field.set(new TimeOfDay(), 2, values, "30", null);
./joda/time/field/TestBaseDateTimeField.java:325:        result = field.set(new TimeOfDay(), 2, values, "29", Locale.ENGLISH);
./joda/time/field/TestBaseDateTimeField.java:331:            field.set(new TimeOfDay(), 2, values, "60", null);
./joda/time/field/TestBaseDateTimeField.java:339:            field.set(new TimeOfDay(), 2, values, "-1", null);
./joda/time/field/TestBaseDateTimeField.java:528:        public long set(long instant, int value) {

### Candidate class name: org.joda.time.DateTimeZone, method name: previousTransition
./joda/time/tz/TestBuilder.java:263:            instant = tz.previousTransition(instant);
./joda/time/tz/TestBuilder.java:309:            assertEquals(0, tz.previousTransition(0));
./joda/time/TestDateTimeZone.java:724:                public long previousTransition(long instant) {
./joda/time/TestDateTimeZone.java:863:        public long previousTransition(long instant) {
./joda/time/TestDateTimeZone.java:952:        assertEquals(TEST_TIME_SUMMER, zone.previousTransition(TEST_TIME_SUMMER));
./joda/time/TestDateTimeZone.java:953:        assertEquals(TEST_TIME_WINTER, zone.previousTransition(TEST_TIME_WINTER));
./joda/time/MockZone.java:43:    public long previousTransition(long instant) {

### Candidate class name: org.joda.time.DateTimeField, method name: roundHalfCeiling
./joda/time/TestMutableDateTime_Properties.java:554:        test.hourOfDay().roundHalfCeiling();
./joda/time/TestMutableDateTime_Properties.java:558:        test.hourOfDay().roundHalfCeiling();
./joda/time/TestMutableDateTime_Properties.java:562:        test.hourOfDay().roundHalfCeiling();
./joda/time/field/TestPreciseDateTimeField.java:505:        assertEquals(0L, field.roundHalfCeiling(0L));
./joda/time/field/TestPreciseDateTimeField.java:506:        assertEquals(0L, field.roundHalfCeiling(29L));
./joda/time/field/TestPreciseDateTimeField.java:507:        assertEquals(60L, field.roundHalfCeiling(30L));
./joda/time/field/TestPreciseDateTimeField.java:508:        assertEquals(60L, field.roundHalfCeiling(31L));
./joda/time/field/TestPreciseDateTimeField.java:509:        assertEquals(60L, field.roundHalfCeiling(60L));
./joda/time/field/TestOffsetDateTimeField.java:504:        assertEquals(0L, field.roundHalfCeiling(0L));
./joda/time/field/TestOffsetDateTimeField.java:505:        assertEquals(0L, field.roundHalfCeiling(499L));
./joda/time/field/TestOffsetDateTimeField.java:506:        assertEquals(1000L, field.roundHalfCeiling(500L));
./joda/time/field/TestOffsetDateTimeField.java:507:        assertEquals(1000L, field.roundHalfCeiling(501L));
./joda/time/field/TestOffsetDateTimeField.java:508:        assertEquals(1000L, field.roundHalfCeiling(1000L));
./joda/time/field/TestPreciseDurationDateTimeField.java:504:        assertEquals(0L, field.roundHalfCeiling(0L));
./joda/time/field/TestPreciseDurationDateTimeField.java:505:        assertEquals(0L, field.roundHalfCeiling(29L));
./joda/time/field/TestPreciseDurationDateTimeField.java:506:        assertEquals(60L, field.roundHalfCeiling(30L));
./joda/time/field/TestPreciseDurationDateTimeField.java:507:        assertEquals(60L, field.roundHalfCeiling(31L));
./joda/time/field/TestPreciseDurationDateTimeField.java:508:        assertEquals(60L, field.roundHalfCeiling(60L));
./joda/time/field/TestUnsupportedDateTimeField.java:169:     * roundFloor(long instant) * roundHalfCeiling(long instant) *
./joda/time/field/TestUnsupportedDateTimeField.java:452:        // UnsupportedDateTimeField.roundHalfCeiling(long instant) is
./joda/time/field/TestUnsupportedDateTimeField.java:456:            fieldOne.roundHalfCeiling(1000000L);
./joda/time/field/TestBaseDateTimeField.java:489:        assertEquals(0L, field.roundHalfCeiling(0L));
./joda/time/field/TestBaseDateTimeField.java:490:        assertEquals(0L, field.roundHalfCeiling(29L));
./joda/time/field/TestBaseDateTimeField.java:491:        assertEquals(60L, field.roundHalfCeiling(30L));
./joda/time/field/TestBaseDateTimeField.java:492:        assertEquals(60L, field.roundHalfCeiling(31L));
./joda/time/field/TestBaseDateTimeField.java:493:        assertEquals(60L, field.roundHalfCeiling(60L));

### Candidate class name: org.joda.time.DateTimeField, method name: addWrapPartial
./joda/time/field/TestUnsupportedDateTimeField.java:152:     * addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values, int
./joda/time/field/TestUnsupportedDateTimeField.java:204:        // addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values,
./joda/time/field/TestUnsupportedDateTimeField.java:207:            fieldOne.addWrapPartial(localTime, 0, new int[] { 0, 100 }, 100);

### Candidate class name: org.joda.time.DateTimeField, method name: getMaximumShortTextLength
./joda/time/TestPartial_Properties.java:101:        assertEquals(2, test.property(DateTimeFieldType.hourOfDay()).getMaximumShortTextLength(null));
./joda/time/TestPartial_Properties.java:254:        assertEquals(2, test.property(DateTimeFieldType.minuteOfHour()).getMaximumShortTextLength(null));
./joda/time/TestDateTime_Properties.java:126:        assertEquals(2, test.era().getMaximumShortTextLength(null));
./joda/time/TestDateTime_Properties.java:127:        assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH));
./joda/time/TestDateTime_Properties.java:146:        assertEquals(9, test.yearOfEra().getMaximumShortTextLength(null));
./joda/time/TestDateTime_Properties.java:165:        assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null));
./joda/time/TestDateTime_Properties.java:184:        assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null));
./joda/time/TestDateTime_Properties.java:203:        assertEquals(9, test.weekyear().getMaximumShortTextLength(null));
./joda/time/TestDateTime_Properties.java:222:        assertEquals(9, test.year().getMaximumShortTextLength(null));
./joda/time/TestDateTime_Properties.java:359:        assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
./joda/time/TestDateTime_Properties.java:530:        assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
./joda/time/TestDateTime_Properties.java:707:        assertEquals(3, test.dayOfYear().getMaximumShortTextLength(null));
./joda/time/TestDateTime_Properties.java:854:        assertEquals(2, test.weekOfWeekyear().getMaximumShortTextLength(null));
./joda/time/TestDateTime_Properties.java:972:        assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null));
./joda/time/TestDateTime_Properties.java:973:        assertEquals(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH));
./joda/time/TestDateTime_Properties.java:1106:        assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null));
./joda/time/TestDateTime_Properties.java:1201:        assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null));
./joda/time/TestDateTime_Properties.java:1220:        assertEquals(4, test.minuteOfDay().getMaximumShortTextLength(null));
./joda/time/TestDateTime_Properties.java:1239:        assertEquals(2, test.secondOfMinute().getMaximumShortTextLength(null));
./joda/time/TestDateTime_Properties.java:1258:        assertEquals(5, test.secondOfDay().getMaximumShortTextLength(null));
./joda/time/TestDateTime_Properties.java:1277:        assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null));
./joda/time/TestDateTime_Properties.java:1296:        assertEquals(8, test.millisOfDay().getMaximumShortTextLength(null));
./joda/time/TestMonthDay_Properties.java:96:        assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
./joda/time/TestMonthDay_Properties.java:192:        assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
./joda/time/TestYearMonthDay_Properties.java:100:        assertEquals(9, test.year().getMaximumShortTextLength(null));
./joda/time/TestYearMonthDay_Properties.java:211:        assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
./joda/time/TestYearMonthDay_Properties.java:356:        assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
./joda/time/TestLocalTime_Properties.java:93:        assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null));
./joda/time/TestLocalTime_Properties.java:281:        assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null));
./joda/time/TestLocalTime_Properties.java:458:        assertEquals(2, test.secondOfMinute().getMaximumShortTextLength(null));
./joda/time/TestLocalTime_Properties.java:629:        assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null));
./joda/time/TestDateMidnight_Properties.java:122:        assertEquals(2, test.era().getMaximumShortTextLength(null));
./joda/time/TestDateMidnight_Properties.java:123:        assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH));
./joda/time/TestDateMidnight_Properties.java:141:        assertEquals(9, test.yearOfEra().getMaximumShortTextLength(null));
./joda/time/TestDateMidnight_Properties.java:159:        assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null));
./joda/time/TestDateMidnight_Properties.java:177:        assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null));
./joda/time/TestDateMidnight_Properties.java:195:        assertEquals(9, test.weekyear().getMaximumShortTextLength(null));
./joda/time/TestDateMidnight_Properties.java:213:        assertEquals(9, test.year().getMaximumShortTextLength(null));
./joda/time/TestDateMidnight_Properties.java:236:        assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
./joda/time/TestDateMidnight_Properties.java:385:        assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
./joda/time/TestDateMidnight_Properties.java:425:        assertEquals(3, test.dayOfYear().getMaximumShortTextLength(null));
./joda/time/TestDateMidnight_Properties.java:446:        assertEquals(2, test.weekOfWeekyear().getMaximumShortTextLength(null));
./joda/time/TestDateMidnight_Properties.java:469:        assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null));
./joda/time/TestDateMidnight_Properties.java:470:        assertEquals(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH));
./joda/time/TestMutableDateTime_Properties.java:114:        assertEquals(2, test.era().getMaximumShortTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:115:        assertEquals(9, test.era().getMaximumShortTextLength(Locale.FRENCH));
./joda/time/TestMutableDateTime_Properties.java:132:        assertEquals(9, test.yearOfEra().getMaximumShortTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:149:        assertEquals(7, test.centuryOfEra().getMaximumShortTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:166:        assertEquals(2, test.yearOfCentury().getMaximumShortTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:183:        assertEquals(9, test.weekyear().getMaximumShortTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:200:        assertEquals(9, test.year().getMaximumShortTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:245:        assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:305:        assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:354:        assertEquals(3, test.dayOfYear().getMaximumShortTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:411:        assertEquals(2, test.weekOfWeekyear().getMaximumShortTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:456:        assertEquals(3, test.dayOfWeek().getMaximumShortTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:457:        assertEquals(4, test.dayOfWeek().getMaximumShortTextLength(Locale.FRENCH));
./joda/time/TestMutableDateTime_Properties.java:523:        assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:603:        assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:620:        assertEquals(4, test.minuteOfDay().getMaximumShortTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:637:        assertEquals(2, test.secondOfMinute().getMaximumShortTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:654:        assertEquals(5, test.secondOfDay().getMaximumShortTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:671:        assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:688:        assertEquals(8, test.millisOfDay().getMaximumShortTextLength(null));
./joda/time/TestLocalDate_Properties.java:98:        assertEquals(9, test.year().getMaximumShortTextLength(null));
./joda/time/TestLocalDate_Properties.java:208:        assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
./joda/time/TestLocalDate_Properties.java:352:        assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
./joda/time/TestLocalDateTime_Properties.java:103:        assertEquals(9, test.year().getMaximumShortTextLength(null));
./joda/time/TestLocalDateTime_Properties.java:213:        assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));
./joda/time/TestLocalDateTime_Properties.java:357:        assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null));
./joda/time/TestLocalDateTime_Properties.java:546:        assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null));
./joda/time/TestLocalDateTime_Properties.java:706:        assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null));
./joda/time/TestLocalDateTime_Properties.java:837:        assertEquals(2, test.secondOfMinute().getMaximumShortTextLength(null));
./joda/time/TestLocalDateTime_Properties.java:965:        assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null));
./joda/time/TestTimeOfDay_Properties.java:95:        assertEquals(2, test.hourOfDay().getMaximumShortTextLength(null));
./joda/time/TestTimeOfDay_Properties.java:248:        assertEquals(2, test.minuteOfHour().getMaximumShortTextLength(null));
./joda/time/TestTimeOfDay_Properties.java:420:        assertEquals(2, test.secondOfMinute().getMaximumShortTextLength(null));
./joda/time/TestTimeOfDay_Properties.java:586:        assertEquals(3, test.millisOfSecond().getMaximumShortTextLength(null));
./joda/time/field/TestPreciseDateTimeField.java:462:        assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH));
./joda/time/field/TestOffsetDateTimeField.java:461:        assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH));
./joda/time/field/TestPreciseDurationDateTimeField.java:461:        assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH));
./joda/time/field/TestUnsupportedDateTimeField.java:161:     * getMaximumShortTextLength(Locale locale) * getMaximumTextLength(Locale
./joda/time/field/TestUnsupportedDateTimeField.java:317:        // UnsupportedDateTimeField.getMaximumShortTextLength(Locale locale)
./joda/time/field/TestUnsupportedDateTimeField.java:321:            fieldOne.getMaximumShortTextLength(Locale.getDefault());
./joda/time/field/TestBaseDateTimeField.java:456:        assertEquals(2, field.getMaximumShortTextLength(Locale.ENGLISH));
./joda/time/TestYearMonth_Properties.java:99:        assertEquals(9, test.year().getMaximumShortTextLength(null));
./joda/time/TestYearMonth_Properties.java:210:        assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null));

### Candidate class name: org.joda.time.DurationField, method name: compareTo
./joda/time/TestDateTimeComparator.java:950:            if ( lhVal.compareTo( rhVal) > 0 ) return false;
./joda/time/TestDuration_Basics.java:158:        assertEquals(0, test1.compareTo(test1a));
./joda/time/TestDuration_Basics.java:159:        assertEquals(0, test1a.compareTo(test1));
./joda/time/TestDuration_Basics.java:160:        assertEquals(0, test1.compareTo(test1));
./joda/time/TestDuration_Basics.java:161:        assertEquals(0, test1a.compareTo(test1a));
./joda/time/TestDuration_Basics.java:164:        assertEquals(-1, test1.compareTo(test2));
./joda/time/TestDuration_Basics.java:165:        assertEquals(+1, test2.compareTo(test1));
./joda/time/TestDuration_Basics.java:167:        assertEquals(+1, test2.compareTo(new MockDuration(123L)));
./joda/time/TestDuration_Basics.java:168:        assertEquals(0, test1.compareTo(new MockDuration(123L)));
./joda/time/TestDuration_Basics.java:171:            test1.compareTo(null);
./joda/time/TestDuration_Basics.java:175://            test1.compareTo(new Long(123L));
./joda/time/TestDateTime_Basics.java:342:        assertEquals(0, test1.compareTo(test1a));
./joda/time/TestDateTime_Basics.java:343:        assertEquals(0, test1a.compareTo(test1));
./joda/time/TestDateTime_Basics.java:344:        assertEquals(0, test1.compareTo(test1));
./joda/time/TestDateTime_Basics.java:345:        assertEquals(0, test1a.compareTo(test1a));
./joda/time/TestDateTime_Basics.java:348:        assertEquals(-1, test1.compareTo(test2));
./joda/time/TestDateTime_Basics.java:349:        assertEquals(+1, test2.compareTo(test1));
./joda/time/TestDateTime_Basics.java:352:        assertEquals(-1, test1.compareTo(test3));
./joda/time/TestDateTime_Basics.java:353:        assertEquals(+1, test3.compareTo(test1));
./joda/time/TestDateTime_Basics.java:354:        assertEquals(0, test3.compareTo(test2));
./joda/time/TestDateTime_Basics.java:356:        assertEquals(+1, test2.compareTo(new MockInstant()));
./joda/time/TestDateTime_Basics.java:357:        assertEquals(0, test1.compareTo(new MockInstant()));
./joda/time/TestDateTime_Basics.java:360:            test1.compareTo(null);
./joda/time/TestDateTime_Basics.java:364://            test1.compareTo(new Date());

### Candidate class name: org.joda.time.chrono.BasicChronology, method name: getYearDifference
not in /src/test/java/org

### Candidate class name: org.joda.time.DateTimeField, method name: addWrapField
./joda/time/TestMutableDateTime_Properties.java:        test.year().addWrapField(9);
./joda/time/TestMutableDateTime_Properties.java:        test.monthOfYear().addWrapField(8);
./joda/time/TestMutableDateTime_Properties.java:        test.dayOfMonth().addWrapField(22);
./joda/time/TestMutableDateTime_Properties.java:        test.dayOfYear().addWrapField(206);
./joda/time/TestMutableDateTime_Properties.java:        test.weekOfWeekyear().addWrapField(30);
./joda/time/TestMutableDateTime_Properties.java:        test.dayOfWeek().addWrapField(5);
./joda/time/chrono/gj/TestJulianWeekyearField.java:    public long addWrapField(long millis, int value) {
./joda/time/chrono/gj/MainTest.java:        x = fieldA.addWrapField(millis, value);
./joda/time/chrono/gj/MainTest.java:        y = fieldB.addWrapField(millis, value);
./joda/time/chrono/gj/TestJulianYearField.java:    public long addWrapField(long millis, int value) {
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(29 * 60L, field.addWrapField(60L * 29, 0));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(59 * 60L, field.addWrapField(60L * 29, 30));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(0 * 60L, field.addWrapField(60L * 29, 31));
./joda/time/field/TestPreciseDateTimeField.java:        int[] result = field.addWrapField(new TimeOfDay(), 2, values, 0);
./joda/time/field/TestPreciseDateTimeField.java:        result = field.addWrapField(new TimeOfDay(), 2, values, 29);
./joda/time/field/TestPreciseDateTimeField.java:        result = field.addWrapField(new TimeOfDay(), 2, values, 30);
./joda/time/field/TestPreciseDateTimeField.java:        result = field.addWrapField(new TimeOfDay(), 2, values, 31);
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(29 * 1000L, field.addWrapField(1000L * 29, 0));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(59 * 1000L, field.addWrapField(1000L * 29, 30));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(0L, field.addWrapField(1000L * 29, 31));
./joda/time/field/TestOffsetDateTimeField.java:        int[] result = field.addWrapField(new TimeOfDay(), 2, values, 0);
./joda/time/field/TestOffsetDateTimeField.java:        result = field.addWrapField(new TimeOfDay(), 2, values, 29);
./joda/time/field/TestOffsetDateTimeField.java:        result = field.addWrapField(new TimeOfDay(), 2, values, 33);
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(29 * 60L, field.addWrapField(60L * 29, 0));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(59 * 60L, field.addWrapField(60L * 29, 30));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(0 * 60L, field.addWrapField(60L * 29, 31));
./joda/time/field/TestPreciseDurationDateTimeField.java:        int[] result = field.addWrapField(new TimeOfDay(), 2, values, 0);
./joda/time/field/TestPreciseDurationDateTimeField.java:        result = field.addWrapField(new TimeOfDay(), 2, values, 29);
./joda/time/field/TestPreciseDurationDateTimeField.java:        result = field.addWrapField(new TimeOfDay(), 2, values, 30);
./joda/time/field/TestPreciseDurationDateTimeField.java:        result = field.addWrapField(new TimeOfDay(), 2, values, 31);
./joda/time/field/TestUnsupportedDateTimeField.java:     * int fieldIndex, int[] values, int valueToAdd) * addWrapField(long
./joda/time/field/TestUnsupportedDateTimeField.java:     * instant, int value) * addWrapField(ReadablePartial instant, int
./joda/time/field/TestUnsupportedDateTimeField.java:        // addWrapField(long instant, int value)
./joda/time/field/TestUnsupportedDateTimeField.java:            fieldOne.addWrapField(100000L, 250);
./joda/time/field/TestUnsupportedDateTimeField.java:        // addWrapField(ReadablePartial instant, int fieldIndex, int[] values,
./joda/time/field/TestUnsupportedDateTimeField.java:            fieldOne.addWrapField(localTime, 0, new int[] { 0, 100 }, 100);
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(1029, field.addWrapField(60L * 29, 0));
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(1059, field.addWrapField(60L * 29, 30));
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(1000, field.addWrapField(60L * 29, 31));
./joda/time/field/TestBaseDateTimeField.java:        int[] result = field.addWrapField(new TimeOfDay(), 2, values, 0);
./joda/time/field/TestBaseDateTimeField.java:        result = field.addWrapField(new TimeOfDay(), 2, values, 29);
./joda/time/field/TestBaseDateTimeField.java:        result = field.addWrapField(new TimeOfDay(), 2, values, 30);
./joda/time/field/TestBaseDateTimeField.java:        result = field.addWrapField(new TimeOfDay(), 2, values, 31);

### Candidate class name: org.joda.time.DurationField, method name: getMillis
./joda/time/TestDuration_Basics.java:        assertEquals(0, test.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(1234567890L, test.getMillis());
./joda/time/TestDuration_Basics.java:        public long getMillis() {
./joda/time/TestDuration_Basics.java:            assertEquals(8, test.getMillis());
./joda/time/TestDuration_Basics.java:            assertEquals(8, test.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(new Period(test.getMillis(), PeriodType.standard().withMillisRemoved()), result);
./joda/time/TestDuration_Basics.java:        assertEquals(new Period(test.getMillis(), ISOChronology.getInstanceUTC()), result);
./joda/time/TestDuration_Basics.java:        assertEquals(new Period(test.getMillis(), PeriodType.standard().withMillisRemoved(), ISOChronology.getInstanceUTC()), result);
./joda/time/TestDuration_Basics.java:        assertEquals(1234567890L, result.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(8123L, result.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(16123L, result.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals((123L - 8000L), result.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(8123L, result.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(123L - 8000L, result.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(246L, result.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(123L, result.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(123L, result.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(61L, result.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(18L, result.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(-246L, result.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(246L, result.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(246L, new Duration(246L).abs().getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(0L, new Duration(0L).abs().getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(246L, new Duration(-246L).abs().getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(8123L, result.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(16123L, result.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals((123L - 8000L), result.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(8123L, result.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(123L - 8000L, result.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(123L, test.getMillis());
./joda/time/TestDuration_Basics.java:        assertEquals(2345L, test.getMillis());

### Candidate class name: org.joda.time.DurationField, method name: getValue
./joda/time/field/TestPreciseDurationField.java:        assertEquals(0, iField.getValue(0L));
./joda/time/field/TestPreciseDurationField.java:        assertEquals(12345, iField.getValue(12345678L));
./joda/time/field/TestPreciseDurationField.java:        assertEquals(-1, iField.getValue(-1234L));
./joda/time/field/TestPreciseDurationField.java:        assertEquals(INTEGER_MAX, iField.getValue(LONG_INTEGER_MAX * 1000L + 999L));
./joda/time/field/TestPreciseDurationField.java:            iField.getValue(LONG_INTEGER_MAX * 1000L + 1000L);
./joda/time/field/TestPreciseDurationField.java:        assertEquals(0, iField.getValue(0L, 567L));
./joda/time/field/TestPreciseDurationField.java:        assertEquals(12345, iField.getValue(12345678L, 567L));
./joda/time/field/TestPreciseDurationField.java:        assertEquals(-1, iField.getValue(-1234L, 567L));
./joda/time/field/TestPreciseDurationField.java:        assertEquals(INTEGER_MAX, iField.getValue(LONG_INTEGER_MAX * 1000L + 999L, 567L));
./joda/time/field/TestPreciseDurationField.java:            iField.getValue(LONG_INTEGER_MAX * 1000L + 1000L, 567L);
./joda/time/field/TestScaledDurationField.java:        assertEquals(0, iField.getValue(0L));
./joda/time/field/TestScaledDurationField.java:        assertEquals(12345678 / 90, iField.getValue(12345678L));
./joda/time/field/TestScaledDurationField.java:        assertEquals(-1234 / 90, iField.getValue(-1234L));
./joda/time/field/TestScaledDurationField.java:        assertEquals(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX));
./joda/time/field/TestScaledDurationField.java:            iField.getValue(LONG_INTEGER_MAX + 1L);
./joda/time/field/TestScaledDurationField.java:        assertEquals(0, iField.getValue(0L, 567L));
./joda/time/field/TestScaledDurationField.java:        assertEquals(12345678 / 90, iField.getValue(12345678L, 567L));
./joda/time/field/TestScaledDurationField.java:        assertEquals(-1234 / 90, iField.getValue(-1234L, 567L));
./joda/time/field/TestScaledDurationField.java:        assertEquals(INTEGER_MAX / 90, iField.getValue(LONG_INTEGER_MAX, 567L));
./joda/time/field/TestScaledDurationField.java:            iField.getValue(LONG_INTEGER_MAX + 1L, 567L);
./joda/time/field/TestMillisDurationField.java:        assertEquals(0, MillisDurationField.INSTANCE.getValue(0L));
./joda/time/field/TestMillisDurationField.java:        assertEquals(1234, MillisDurationField.INSTANCE.getValue(1234L));
./joda/time/field/TestMillisDurationField.java:        assertEquals(-1234, MillisDurationField.INSTANCE.getValue(-1234L));
./joda/time/field/TestMillisDurationField.java:            MillisDurationField.INSTANCE.getValue(((long) (Integer.MAX_VALUE)) + 1L);
./joda/time/field/TestMillisDurationField.java:        assertEquals(0, MillisDurationField.INSTANCE.getValue(0L, 567L));
./joda/time/field/TestMillisDurationField.java:        assertEquals(1234, MillisDurationField.INSTANCE.getValue(1234L, 567L));
./joda/time/field/TestMillisDurationField.java:        assertEquals(-1234, MillisDurationField.INSTANCE.getValue(-1234L, 567L));
./joda/time/field/TestMillisDurationField.java:            MillisDurationField.INSTANCE.getValue(((long) (Integer.MAX_VALUE)) + 1L, 567L);

### Candidate class name: org.joda.time.chrono.BasicChronology, method name: getDaysInMonthMax
not in /src/test/java/org

### Candidate class name: org.joda.time.DurationField, method name: getDifference
./joda/time/TestDateTime_Properties.java:        assertEquals(-2, test1.hourOfDay().getDifference(test2));
./joda/time/TestDateTime_Properties.java:        assertEquals(2, test2.hourOfDay().getDifference(test1));
./joda/time/TestDateTime_Properties.java:        assertEquals(13, test.hourOfDay().getDifference(null));
./joda/time/TestDateMidnight_Properties.java:        assertEquals(-2, test1.monthOfYear().getDifference(test2));
./joda/time/TestDateMidnight_Properties.java:        assertEquals(2, test2.monthOfYear().getDifference(test1));
./joda/time/chrono/TestISOChronology.java:        int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
./joda/time/chrono/TestGJChronology.java:        int diff = field.getDifference(dtEnd.getMillis(), dtStart.getMillis());
./joda/time/chrono/gj/MainTest.java:        x = fieldA.getDifference(millis, millis2);
./joda/time/chrono/gj/MainTest.java:        y = fieldB.getDifference(millis, millis2);
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(30, field.getDifference(0L, 0L));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(-21, field.getDifference(20000L, 41000L));
./joda/time/field/TestPreciseDurationField.java:        assertEquals(0, iField.getDifference(1L, 0L));
./joda/time/field/TestPreciseDurationField.java:        assertEquals(567, iField.getDifference(567000L, 0L));
./joda/time/field/TestPreciseDurationField.java:        assertEquals(567 - 1234, iField.getDifference(567000L, 1234000L));
./joda/time/field/TestPreciseDurationField.java:        assertEquals(567 + 1234, iField.getDifference(567000L, -1234000L));
./joda/time/field/TestPreciseDurationField.java:            iField.getDifference(LONG_MAX, -1L);
./joda/time/field/TestScaledDurationField.java:        assertEquals(0, iField.getDifference(1L, 0L));
./joda/time/field/TestScaledDurationField.java:        assertEquals(567, iField.getDifference(567L * 90L, 0L));
./joda/time/field/TestScaledDurationField.java:        assertEquals(567 - 1234, iField.getDifference(567L * 90L, 1234L * 90L));
./joda/time/field/TestScaledDurationField.java:        assertEquals(567 + 1234, iField.getDifference(567L * 90L, -1234L * 90L));
./joda/time/field/TestScaledDurationField.java:            iField.getDifference(LONG_MAX, -1L);
./joda/time/field/TestMillisDurationField.java:        assertEquals(567, MillisDurationField.INSTANCE.getDifference(567L, 0L));
./joda/time/field/TestMillisDurationField.java:        assertEquals(567 - 1234, MillisDurationField.INSTANCE.getDifference(567L, 1234L));
./joda/time/field/TestMillisDurationField.java:        assertEquals(567 + 1234, MillisDurationField.INSTANCE.getDifference(567L, -1234L));
./joda/time/field/TestMillisDurationField.java:            MillisDurationField.INSTANCE.getDifference(Long.MAX_VALUE, 1L);
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(30, field.getDifference(0L, 0L));
./joda/time/field/TestUnsupportedDateTimeField.java:        // UnsupportedDateTimeField.getDifference(long minuendInstant,
./joda/time/field/TestUnsupportedDateTimeField.java:            fieldOne.getDifference(100000L, 1000L);
./joda/time/field/TestUnsupportedDateTimeField.java:            int firstDifference = hoursDuration.getDifference(100000L, 1000L);
./joda/time/field/TestUnsupportedDateTimeField.java:            int secondDifference = fieldTwo.getDifference(100000L, 1000L);
./joda/time/field/TestUnsupportedDateTimeField.java:            long firstDifference = hoursDuration.getDifference(100000L, 1000L);
./joda/time/field/TestUnsupportedDateTimeField.java:            long secondDifference = fieldTwo.getDifference(100000L, 1000L);
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(30, field.getDifference(0L, 0L));

### Candidate class name: org.joda.time.field.BaseDateTimeField, method name: roundFloor
./joda/time/TestMutableDateTime_Properties.java:        test.hourOfDay().roundFloor();
./joda/time/chrono/gj/TestGJDayOfWeekField.java:    public long roundFloor(long millis) {
./joda/time/chrono/gj/TestGJYearField.java:    public long roundFloor(long millis) {
./joda/time/chrono/gj/TestGJMonthOfYearField.java:    public long roundFloor(long millis) {
./joda/time/chrono/gj/TestGJDayOfYearField.java:    public long roundFloor(long millis) {
./joda/time/chrono/gj/TestGJWeekOfWeekyearField.java:        millis = iChronology.weekyear().roundFloor(millis);
./joda/time/chrono/gj/TestGJWeekOfWeekyearField.java:    public long roundFloor(long millis) {
./joda/time/chrono/gj/MainTest.java:        x = fieldA.roundFloor(millis);
./joda/time/chrono/gj/MainTest.java:        y = fieldB.roundFloor(millis);
./joda/time/chrono/gj/TestGJDayOfMonthField.java:    public long roundFloor(long millis) {
./joda/time/chrono/gj/TestGJWeekyearField.java:    public long roundFloor(long millis) {
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(-120L, field.roundFloor(-61L));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(-60L, field.roundFloor(-60L));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(-60L, field.roundFloor(-59L));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(-60L, field.roundFloor(-1L));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(0L, field.roundFloor(0L));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(0L, field.roundFloor(1L));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(0L, field.roundFloor(29L));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(0L, field.roundFloor(30L));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(0L, field.roundFloor(31L));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(60L, field.roundFloor(60L));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(-2000L, field.roundFloor(-1001L));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(-1000L, field.roundFloor(-1000L));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(-1000L, field.roundFloor(-999L));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(-1000L, field.roundFloor(-1L));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(0L, field.roundFloor(0L));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(0L, field.roundFloor(1L));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(0L, field.roundFloor(499L));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(0L, field.roundFloor(500L));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(0L, field.roundFloor(501L));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(1000L, field.roundFloor(1000L));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(-120L, field.roundFloor(-61L));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(-60L, field.roundFloor(-60L));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(-60L, field.roundFloor(-59L));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(-60L, field.roundFloor(-1L));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(0L, field.roundFloor(0L));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(0L, field.roundFloor(1L));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(0L, field.roundFloor(29L));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(0L, field.roundFloor(30L));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(0L, field.roundFloor(31L));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(60L, field.roundFloor(60L));
./joda/time/field/TestUnsupportedDateTimeField.java:     * roundFloor(long instant) * roundHalfCeiling(long instant) *
./joda/time/field/TestUnsupportedDateTimeField.java:        // UnsupportedDateTimeField.roundFloor(long instant) is unsupported and
./joda/time/field/TestUnsupportedDateTimeField.java:            fieldOne.roundFloor(1000000L);
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(0L, field.roundFloor(0L));
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(0L, field.roundFloor(29L));
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(0L, field.roundFloor(30L));
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(0L, field.roundFloor(31L));
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(60L, field.roundFloor(60L));
./joda/time/field/TestBaseDateTimeField.java:        public long roundFloor(long instant) {

### Candidate class name: org.joda.time.DateTimeField, method name: getMaximumValue
./joda/time/TestDateTime_Properties.java:        assertEquals(292278993, test.year().getMaximumValue());
./joda/time/TestDateTime_Properties.java:        assertEquals(12, test.monthOfYear().getMaximumValue());
./joda/time/TestDateTime_Properties.java:        assertEquals(12, test.monthOfYear().getMaximumValue());
./joda/time/TestDateTime_Properties.java:        assertEquals(30, test.dayOfMonth().getMaximumValue());
./joda/time/TestDateTime_Properties.java:        assertEquals(30, test.dayOfMonth().getMaximumValue());
./joda/time/TestDateTime_Properties.java:        assertEquals(31, test.dayOfMonth().getMaximumValue());
./joda/time/TestDateTime_Properties.java:        assertEquals(29, test.dayOfMonth().getMaximumValue());
./joda/time/TestDateTime_Properties.java:        assertEquals(28, test.dayOfMonth().getMaximumValue());
./joda/time/TestDateTime_Properties.java:        assertEquals(366, test.dayOfYear().getMaximumValue());
./joda/time/TestDateTime_Properties.java:        assertEquals(365, test.dayOfYear().getMaximumValue());
./joda/time/TestDateTime_Properties.java:        assertEquals(53, test.weekOfWeekyear().getMaximumValue());
./joda/time/TestDateTime_Properties.java:        assertEquals(52, test.weekOfWeekyear().getMaximumValue());
./joda/time/TestDateTime_Properties.java:        assertEquals(7, test.dayOfWeek().getMaximumValue());
./joda/time/TestMonthDay_Properties.java:        assertEquals(12, test.monthOfYear().getMaximumValue());
./joda/time/TestMonthDay_Properties.java:        assertEquals(30, test.dayOfMonth().getMaximumValue());

./joda/time/TestMutableDateTime_Properties.java:        assertEquals(292278993, test.year().getMaximumValue());
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(12, test.monthOfYear().getMaximumValue());
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(12, test.monthOfYear().getMaximumValue());
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(30, test.dayOfMonth().getMaximumValue());
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(7, test.dayOfWeek().getMaximumValue());

./joda/time/field/TestPreciseDateTimeField.java:    public void test_getMaximumValue() {
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(59, field.getMaximumValue());
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(59, field.getMaximumValue(0L));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(59, field.getMaximumValue(new TimeOfDay()));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(59, field.getMaximumValue(new TimeOfDay(), new int[4]));
./joda/time/field/TestOffsetDateTimeField.java:    public void test_getMaximumValue() {
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(62, field.getMaximumValue());
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(62, field.getMaximumValue(0L));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(62, field.getMaximumValue(new TimeOfDay()));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(62, field.getMaximumValue(new TimeOfDay(), new int[4]));
./joda/time/field/TestPreciseDurationDateTimeField.java:    public void test_getMaximumValue() {
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(59, field.getMaximumValue());
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(59, field.getMaximumValue(0L));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(59, field.getMaximumValue(new TimeOfDay()));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(59, field.getMaximumValue(new TimeOfDay(), new int[4]));
./joda/time/field/TestPreciseDurationDateTimeField.java:            public int getMaximumValue() {
./joda/time/field/TestPreciseDurationDateTimeField.java:            public int getMaximumValue() {
./joda/time/field/TestPreciseDurationDateTimeField.java:            public int getMaximumValue() {
./joda/time/field/TestPreciseDurationDateTimeField.java:            public int getMaximumValue() {
./joda/time/field/TestPreciseDurationDateTimeField.java:        public int getMaximumValue() {
./joda/time/field/TestUnsupportedDateTimeField.java:     * locale) * getMaximumValue() * getMaximumValue(long instant) *
./joda/time/field/TestUnsupportedDateTimeField.java:     * getMaximumValue(ReadablePartial instant) *
./joda/time/field/TestUnsupportedDateTimeField.java:     * getMaximumValue(ReadablePartial instant, int[] values) *
./joda/time/field/TestUnsupportedDateTimeField.java:        // UnsupportedDateTimeField.getMaximumValue() is unsupported
./joda/time/field/TestUnsupportedDateTimeField.java:            fieldOne.getMaximumValue();
./joda/time/field/TestUnsupportedDateTimeField.java:        // UnsupportedDateTimeField.getMaximumValue(long instant)
./joda/time/field/TestUnsupportedDateTimeField.java:            fieldOne.getMaximumValue(1000000L);
./joda/time/field/TestUnsupportedDateTimeField.java:        // UnsupportedDateTimeField.getMaximumValue(ReadablePartial instant)
./joda/time/field/TestUnsupportedDateTimeField.java:            fieldOne.getMaximumValue(localTime);
./joda/time/field/TestUnsupportedDateTimeField.java:        // UnsupportedDateTimeField.getMaximumValue(ReadablePartial instant,
./joda/time/field/TestUnsupportedDateTimeField.java:            fieldOne.getMaximumValue(localTime, new int[] { 0 });
./joda/time/field/TestBaseDateTimeField.java:    public void test_getMaximumValue() {
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(59, field.getMaximumValue());
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(59, field.getMaximumValue(0L));
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(59, field.getMaximumValue(new TimeOfDay()));
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(59, field.getMaximumValue(new TimeOfDay(), new int[4]));
./joda/time/field/TestBaseDateTimeField.java:            public int getMaximumValue() {
./joda/time/field/TestBaseDateTimeField.java:            public int getMaximumValue() {
./joda/time/field/TestBaseDateTimeField.java:            public int getMaximumValue() {
./joda/time/field/TestBaseDateTimeField.java:            public int getMaximumValue() {
./joda/time/field/TestBaseDateTimeField.java:        public int getMaximumValue() {

### Candidate class name: org.joda.time.DateTimeField, method name: getMaximumTextLength
./joda/time/TestPartial_Properties.java:        assertEquals(2, test.property(DateTimeFieldType.hourOfDay()).getMaximumTextLength(null));
./joda/time/TestPartial_Properties.java:        assertEquals(2, test.property(DateTimeFieldType.minuteOfHour()).getMaximumTextLength(null));
./joda/time/TestDateTime_Properties.java:        assertEquals(2, test.era().getMaximumTextLength(null));
./joda/time/TestDateTime_Properties.java:        assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH));
./joda/time/TestDateTime_Properties.java:        assertEquals(9, test.yearOfEra().getMaximumTextLength(null));
./joda/time/TestDateTime_Properties.java:        assertEquals(7, test.centuryOfEra().getMaximumTextLength(null));
./joda/time/TestDateTime_Properties.java:        assertEquals(2, test.yearOfCentury().getMaximumTextLength(null));
./joda/time/TestDateTime_Properties.java:        assertEquals(9, test.weekyear().getMaximumTextLength(null));
./joda/time/TestDateTime_Properties.java:        assertEquals(9, test.year().getMaximumTextLength(null));
./joda/time/TestDateTime_Properties.java:        assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
./joda/time/TestDateTime_Properties.java:        assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
./joda/time/TestDateTime_Properties.java:        assertEquals(3, test.dayOfYear().getMaximumTextLength(null));
./joda/time/TestDateTime_Properties.java:        assertEquals(2, test.weekOfWeekyear().getMaximumTextLength(null));
./joda/time/TestDateTime_Properties.java:        assertEquals(9, test.dayOfWeek().getMaximumTextLength(null));
./joda/time/TestDateTime_Properties.java:        assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH));
./joda/time/TestDateTime_Properties.java:        assertEquals(2, test.hourOfDay().getMaximumTextLength(null));
./joda/time/TestDateTime_Properties.java:        assertEquals(2, test.minuteOfHour().getMaximumTextLength(null));
./joda/time/TestDateTime_Properties.java:        assertEquals(4, test.minuteOfDay().getMaximumTextLength(null));
./joda/time/TestDateTime_Properties.java:        assertEquals(2, test.secondOfMinute().getMaximumTextLength(null));
./joda/time/TestDateTime_Properties.java:        assertEquals(5, test.secondOfDay().getMaximumTextLength(null));
./joda/time/TestDateTime_Properties.java:        assertEquals(3, test.millisOfSecond().getMaximumTextLength(null));
./joda/time/TestDateTime_Properties.java:        assertEquals(8, test.millisOfDay().getMaximumTextLength(null));
./joda/time/TestMonthDay_Properties.java:        assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
./joda/time/TestMonthDay_Properties.java:        assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
./joda/time/TestYearMonthDay_Properties.java:        assertEquals(9, test.year().getMaximumTextLength(null));
./joda/time/TestYearMonthDay_Properties.java:        assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
./joda/time/TestYearMonthDay_Properties.java:        assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
./joda/time/TestLocalTime_Properties.java:        assertEquals(2, test.hourOfDay().getMaximumTextLength(null));
./joda/time/TestLocalTime_Properties.java:        assertEquals(2, test.minuteOfHour().getMaximumTextLength(null));
./joda/time/TestLocalTime_Properties.java:        assertEquals(2, test.secondOfMinute().getMaximumTextLength(null));
./joda/time/TestLocalTime_Properties.java:        assertEquals(3, test.millisOfSecond().getMaximumTextLength(null));
./joda/time/TestDateMidnight_Properties.java:        assertEquals(2, test.era().getMaximumTextLength(null));
./joda/time/TestDateMidnight_Properties.java:        assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH));
./joda/time/TestDateMidnight_Properties.java:        assertEquals(9, test.yearOfEra().getMaximumTextLength(null));
./joda/time/TestDateMidnight_Properties.java:        assertEquals(7, test.centuryOfEra().getMaximumTextLength(null));
./joda/time/TestDateMidnight_Properties.java:        assertEquals(2, test.yearOfCentury().getMaximumTextLength(null));
./joda/time/TestDateMidnight_Properties.java:        assertEquals(9, test.weekyear().getMaximumTextLength(null));
./joda/time/TestDateMidnight_Properties.java:        assertEquals(9, test.year().getMaximumTextLength(null));
./joda/time/TestDateMidnight_Properties.java:        assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
./joda/time/TestDateMidnight_Properties.java:        assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
./joda/time/TestDateMidnight_Properties.java:        assertEquals(3, test.dayOfYear().getMaximumTextLength(null));
./joda/time/TestDateMidnight_Properties.java:        assertEquals(2, test.weekOfWeekyear().getMaximumTextLength(null));
./joda/time/TestDateMidnight_Properties.java:        assertEquals(9, test.dayOfWeek().getMaximumTextLength(null));
./joda/time/TestDateMidnight_Properties.java:        assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(2, test.era().getMaximumTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(9, test.era().getMaximumTextLength(Locale.FRENCH));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(9, test.yearOfEra().getMaximumTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(7, test.centuryOfEra().getMaximumTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(2, test.yearOfCentury().getMaximumTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(9, test.weekyear().getMaximumTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(9, test.year().getMaximumTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(3, test.dayOfYear().getMaximumTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(2, test.weekOfWeekyear().getMaximumTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(9, test.dayOfWeek().getMaximumTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(8, test.dayOfWeek().getMaximumTextLength(Locale.FRENCH));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(2, test.hourOfDay().getMaximumTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(2, test.minuteOfHour().getMaximumTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(4, test.minuteOfDay().getMaximumTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(2, test.secondOfMinute().getMaximumTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(5, test.secondOfDay().getMaximumTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(3, test.millisOfSecond().getMaximumTextLength(null));
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(8, test.millisOfDay().getMaximumTextLength(null));
./joda/time/TestLocalDate_Properties.java:        assertEquals(9, test.year().getMaximumTextLength(null));
./joda/time/TestLocalDate_Properties.java:        assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
./joda/time/TestLocalDate_Properties.java:        assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
./joda/time/TestLocalDateTime_Properties.java:        assertEquals(9, test.year().getMaximumTextLength(null));
./joda/time/TestLocalDateTime_Properties.java:        assertEquals(9, test.monthOfYear().getMaximumTextLength(null));
./joda/time/TestLocalDateTime_Properties.java:        assertEquals(2, test.dayOfMonth().getMaximumTextLength(null));
./joda/time/TestLocalDateTime_Properties.java:        assertEquals(2, test.hourOfDay().getMaximumTextLength(null));
./joda/time/TestLocalDateTime_Properties.java:        assertEquals(2, test.minuteOfHour().getMaximumTextLength(null));
./joda/time/TestLocalDateTime_Properties.java:        assertEquals(2, test.secondOfMinute().getMaximumTextLength(null));
./joda/time/TestLocalDateTime_Properties.java:        assertEquals(3, test.millisOfSecond().getMaximumTextLength(null));
./joda/time/TestTimeOfDay_Properties.java:        assertEquals(2, test.hourOfDay().getMaximumTextLength(null));
./joda/time/TestTimeOfDay_Properties.java:        assertEquals(2, test.minuteOfHour().getMaximumTextLength(null));
./joda/time/TestTimeOfDay_Properties.java:        assertEquals(2, test.secondOfMinute().getMaximumTextLength(null));
./joda/time/TestTimeOfDay_Properties.java:        assertEquals(3, test.millisOfSecond().getMaximumTextLength(null));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(1, field.getMaximumTextLength(Locale.ENGLISH));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(3, field.getMaximumTextLength(Locale.ENGLISH));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(4, field.getMaximumTextLength(Locale.ENGLISH));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));
./joda/time/field/TestUnsupportedDateTimeField.java:     * getMaximumShortTextLength(Locale locale) * getMaximumTextLength(Locale
./joda/time/field/TestUnsupportedDateTimeField.java:        // UnsupportedDateTimeField.getMaximumTextLength(Locale locale)
./joda/time/field/TestUnsupportedDateTimeField.java:            fieldOne.getMaximumTextLength(Locale.getDefault());
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(1, field.getMaximumTextLength(Locale.ENGLISH));
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(3, field.getMaximumTextLength(Locale.ENGLISH));
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(4, field.getMaximumTextLength(Locale.ENGLISH));
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(2, field.getMaximumTextLength(Locale.ENGLISH));
./joda/time/TestYearMonth_Properties.java:        assertEquals(9, test.year().getMaximumTextLength(null));
./joda/time/TestYearMonth_Properties.java:        assertEquals(9, test.monthOfYear().getMaximumTextLength(null));

### Candidate class name: org.joda.time.DateTimeZone, method name: nextTransition
./joda/time/tz/TestCompiler.java:        long next = zone.nextTransition(dt.getMillis());
./joda/time/tz/TestCompiler.java:        long next = zone.nextTransition(dt.getMillis());
./joda/time/tz/TestCompiler.java:        long next = zone.nextTransition(dt.getMillis());
./joda/time/tz/TestCompiler.java:        long next = zone.nextTransition(dt.getMillis());
./joda/time/tz/TestBuilder.java:                instant = tz.nextTransition(instant);
./joda/time/tz/TestBuilder.java:            assertEquals(0, tz.nextTransition(0));
./joda/time/TestDateTimeZoneCutover.java://  System.out.println(ZONE_NEW_YORK.nextTransition(x.getMillis()));
./joda/time/TestDateTimeZoneCutover.java://  DateTime y = new DateTime(ZONE_NEW_YORK.nextTransition(x.getMillis()), ZONE_NEW_YORK);
./joda/time/TestDateTimeZoneCutover.java://      System.out.println(ZONE_MOSCOW.nextTransition(x.getMillis()));
./joda/time/TestDateTimeZoneCutover.java://      DateTime y = new DateTime(ZONE_MOSCOW.nextTransition(x.getMillis()), ZONE_MOSCOW);
./joda/time/TestDateTimeZone.java:                public long nextTransition(long instant) {
./joda/time/TestDateTimeZone.java:        public long nextTransition(long instant) {
./joda/time/TestDateTimeZone.java:        assertEquals(TEST_TIME_SUMMER, zone.nextTransition(TEST_TIME_SUMMER));
./joda/time/TestDateTimeZone.java:        assertEquals(TEST_TIME_WINTER, zone.nextTransition(TEST_TIME_WINTER));
./joda/time/MockZone.java:    public long nextTransition(long instant) {

### Candidate class name: org.joda.time.field.DecoratedDateTimeField, method name: remainder
./joda/time/TestDateTime_Properties.java:        assertEquals(30L * DateTimeConstants.MILLIS_PER_MINUTE, test.hourOfDay().remainder());
./joda/time/TestDateMidnight_Properties.java:        assertEquals((9L - 1L) * DateTimeConstants.MILLIS_PER_DAY, test.monthOfYear().remainder());
./joda/time/TestMutableDateTime_Properties.java:        assertEquals(30L * DateTimeConstants.MILLIS_PER_MINUTE, test.hourOfDay().remainder());
./joda/time/chrono/gj/MainTest.java:        x = fieldA.remainder(millis);
./joda/time/chrono/gj/MainTest.java:        y = fieldB.remainder(millis);
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(0L, field.remainder(0L));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(29L, field.remainder(29L));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(30L, field.remainder(30L));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(31L, field.remainder(31L));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(0L, field.remainder(60L));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(0L, field.remainder(0L));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(499L, field.remainder(499L));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(500L, field.remainder(500L));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(501L, field.remainder(501L));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(0L, field.remainder(1000L));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(0L, field.remainder(0L));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(29L, field.remainder(29L));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(30L, field.remainder(30L));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(31L, field.remainder(31L));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(0L, field.remainder(60L));
./joda/time/field/TestUnsupportedDateTimeField.java:     * instant) * remainder(long instant) * roundCeiling(long instant) *
./joda/time/field/TestUnsupportedDateTimeField.java:        // UnsupportedDateTimeField.remainder(long instant) is unsupported and
./joda/time/field/TestUnsupportedDateTimeField.java:            fieldOne.remainder(1000000L);
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(0L, field.remainder(0L));
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(29L, field.remainder(29L));
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(30L, field.remainder(30L));
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(31L, field.remainder(31L));
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(0L, field.remainder(60L));

### Candidate class name: org.joda.time.DurationField, method name: getValueAsLong
./joda/time/field/TestPreciseDateTimeField.java:        public long getValueAsLong(long duration, long instant) {
./joda/time/field/TestPreciseDateTimeField.java:        public long getValueAsLong(long duration, long instant) {
./joda/time/field/TestPreciseDateTimeField.java:        public long getValueAsLong(long duration, long instant) {
./joda/time/field/TestPreciseDurationField.java:        assertEquals(0L, iField.getValueAsLong(0L));
./joda/time/field/TestPreciseDurationField.java:        assertEquals(12345L, iField.getValueAsLong(12345678L));
./joda/time/field/TestPreciseDurationField.java:        assertEquals(-1L, iField.getValueAsLong(-1234L));
./joda/time/field/TestPreciseDurationField.java:        assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 1000L + 1000L));
./joda/time/field/TestPreciseDurationField.java:        assertEquals(0L, iField.getValueAsLong(0L, 567L));
./joda/time/field/TestPreciseDurationField.java:        assertEquals(12345L, iField.getValueAsLong(12345678L, 567L));
./joda/time/field/TestPreciseDurationField.java:        assertEquals(-1L, iField.getValueAsLong(-1234L, 567L));
./joda/time/field/TestPreciseDurationField.java:        assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 1000L + 1000L, 567L));
./joda/time/field/TestScaledDurationField.java:        assertEquals(0L, iField.getValueAsLong(0L));
./joda/time/field/TestScaledDurationField.java:        assertEquals(12345678L / 90, iField.getValueAsLong(12345678L));
./joda/time/field/TestScaledDurationField.java:        assertEquals(-1234 / 90L, iField.getValueAsLong(-1234L));
./joda/time/field/TestScaledDurationField.java:        assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L));
./joda/time/field/TestScaledDurationField.java:        assertEquals(0L, iField.getValueAsLong(0L, 567L));
./joda/time/field/TestScaledDurationField.java:        assertEquals(12345678 / 90L, iField.getValueAsLong(12345678L, 567L));
./joda/time/field/TestScaledDurationField.java:        assertEquals(-1234 / 90L, iField.getValueAsLong(-1234L, 567L));
./joda/time/field/TestScaledDurationField.java:        assertEquals(LONG_INTEGER_MAX + 1L, iField.getValueAsLong(LONG_INTEGER_MAX * 90L + 90L, 567L));
./joda/time/field/TestMillisDurationField.java:        assertEquals(0L, MillisDurationField.INSTANCE.getValueAsLong(0L));
./joda/time/field/TestMillisDurationField.java:        assertEquals(1234L, MillisDurationField.INSTANCE.getValueAsLong(1234L));
./joda/time/field/TestMillisDurationField.java:        assertEquals(-1234L, MillisDurationField.INSTANCE.getValueAsLong(-1234L));
./joda/time/field/TestMillisDurationField.java:        assertEquals(((long) (Integer.MAX_VALUE)) + 1L, MillisDurationField.INSTANCE.getValueAsLong(((long) (Integer.MAX_VALUE)) + 1L));
./joda/time/field/TestMillisDurationField.java:        assertEquals(0L, MillisDurationField.INSTANCE.getValueAsLong(0L, 567L));
./joda/time/field/TestMillisDurationField.java:        assertEquals(1234L, MillisDurationField.INSTANCE.getValueAsLong(1234L, 567L));
./joda/time/field/TestMillisDurationField.java:        assertEquals(-1234L, MillisDurationField.INSTANCE.getValueAsLong(-1234L, 567L));
./joda/time/field/TestMillisDurationField.java:        assertEquals(((long) (Integer.MAX_VALUE)) + 1L, MillisDurationField.INSTANCE.getValueAsLong(((long) (Integer.MAX_VALUE)) + 1L, 567L));
./joda/time/field/TestPreciseDurationDateTimeField.java:        public long getValueAsLong(long duration, long instant) {
./joda/time/field/TestPreciseDurationDateTimeField.java:        public long getValueAsLong(long duration, long instant) {
./joda/time/field/TestPreciseDurationDateTimeField.java:        public long getValueAsLong(long duration, long instant) {
./joda/time/field/TestBaseDateTimeField.java:        public long getValueAsLong(long duration, long instant) {

### Candidate class name: org.joda.time.DateTimeField, method name: getMinimumValue
./joda/time/TestDateTime_Properties.java:        assertEquals(-292275054, test.year().getMinimumValue());
./joda/time/TestDateTime_Properties.java:        assertEquals(1, test.monthOfYear().getMinimumValue());
./joda/time/TestDateTime_Properties.java:        assertEquals(1, test.monthOfYear().getMinimumValue());
./joda/time/TestDateTime_Properties.java:        assertEquals(1, test.dayOfMonth().getMinimumValue());
./joda/time/TestDateTime_Properties.java:        assertEquals(1, test.dayOfMonth().getMinimumValue());
./joda/time/TestDateTime_Properties.java:        assertEquals(1, test.dayOfYear().getMinimumValue());
./joda/time/TestDateTime_Properties.java:        assertEquals(1, test.weekOfWeekyear().getMinimumValue());
./joda/time/TestDateTime_Properties.java:        assertEquals(1, test.dayOfWeek().getMinimumValue());
./joda/time/TestMonthDay_Properties.java:        assertEquals(1, test.monthOfYear().getMinimumValue());
./joda/time/TestMonthDay_Properties.java:        assertEquals(1, test.dayOfMonth().getMinimumValue());

./joda/time/field/TestPreciseDateTimeField.java:    public void test_getMinimumValue() {
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(0, field.getMinimumValue());
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(0, field.getMinimumValue(0L));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(0, field.getMinimumValue(new TimeOfDay()));
./joda/time/field/TestPreciseDateTimeField.java:        assertEquals(0, field.getMinimumValue(new TimeOfDay(), new int[4]));
./joda/time/field/TestOffsetDateTimeField.java:    public void test_getMinimumValue() {
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(3, field.getMinimumValue());
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(3, field.getMinimumValue(0L));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(3, field.getMinimumValue(new TimeOfDay()));
./joda/time/field/TestOffsetDateTimeField.java:        assertEquals(3, field.getMinimumValue(new TimeOfDay(), new int[4]));
./joda/time/field/TestPreciseDurationDateTimeField.java:    public void test_getMinimumValue() {
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(0, field.getMinimumValue());
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(0, field.getMinimumValue(0L));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(0, field.getMinimumValue(new TimeOfDay()));
./joda/time/field/TestPreciseDurationDateTimeField.java:        assertEquals(0, field.getMinimumValue(new TimeOfDay(), new int[4]));
./joda/time/field/TestUnsupportedDateTimeField.java:     * getMinimumValue() * getMinimumValue(long instant) *
./joda/time/field/TestUnsupportedDateTimeField.java:     * getMinimumValue(ReadablePartial instant) *
./joda/time/field/TestUnsupportedDateTimeField.java:     * getMinimumValue(ReadablePartial instant, int[] values) * isLeap(long
./joda/time/field/TestUnsupportedDateTimeField.java:            fieldOne.getMinimumValue();
./joda/time/field/TestUnsupportedDateTimeField.java:            fieldOne.getMinimumValue(10000000L);
./joda/time/field/TestUnsupportedDateTimeField.java:            fieldOne.getMinimumValue(localTime);
./joda/time/field/TestUnsupportedDateTimeField.java:            fieldOne.getMinimumValue(localTime, new int[] { 0 });
./joda/time/field/TestBaseDateTimeField.java:    public void test_getMinimumValue() {
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(0, field.getMinimumValue());
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(0, field.getMinimumValue(0L));
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(0, field.getMinimumValue(new TimeOfDay()));
./joda/time/field/TestBaseDateTimeField.java:        assertEquals(0, field.getMinimumValue(new TimeOfDay(), new int[4]));
./joda/time/field/TestBaseDateTimeField.java:        public int getMinimumValue() {


## jfreechart-1.0.10-original:
/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/jfreechart/lib/gnujaxp.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/jfreechart/lib/iText-2.1.1.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/jfreechart/lib/jcommon-1.0.13.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/jfreechart/lib/junit.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/jfreechart/lib/servlet.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/jfreechart/lib/swt.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/jfreechart/lib/swtgraphics2d.jar:/home/daveroar/Graduation_Studies/ThesisWork/OpenSourceProjects/jfreechart/src/org/classes/:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar

### Candidate class name: org.jfree.chart.plot.CategoryPlot, method name: setOrientation
./jfree/chart/plot/junit/CombinedDomainXYPlotTests.java:318:        plot.setOrientation(PlotOrientation.VERTICAL);
./jfree/chart/plot/junit/CategoryPlotTests.java:159:        plot1.setOrientation(PlotOrientation.HORIZONTAL);
./jfree/chart/plot/junit/CategoryPlotTests.java:161:        plot2.setOrientation(PlotOrientation.HORIZONTAL);
./jfree/chart/plot/junit/CategoryPlotTests.java:541:        p1.setOrientation(PlotOrientation.HORIZONTAL);
./jfree/chart/plot/junit/CategoryPlotTests.java:571:        p1.setOrientation(PlotOrientation.VERTICAL);
./jfree/chart/plot/junit/XYPlotTests.java:148:        plot1.setOrientation(PlotOrientation.HORIZONTAL);
./jfree/chart/plot/junit/XYPlotTests.java:150:        plot2.setOrientation(PlotOrientation.HORIZONTAL);
./jfree/chart/plot/junit/CombinedRangeXYPlotTests.java:310:        plot.setOrientation(PlotOrientation.VERTICAL);
./jfree/chart/renderer/category/junit/StatisticalBarRendererTests.java:241:            plot.setOrientation(PlotOrientation.HORIZONTAL);
./jfree/chart/renderer/category/junit/StatisticalBarRendererTests.java:296:            plot.setOrientation(PlotOrientation.HORIZONTAL);
./jfree/chart/renderer/category/junit/BoxAndWhiskerRendererTests.java:289:        plot.setOrientation(PlotOrientation.HORIZONTAL);

### Candidate class name: org.jfree.data.time.RegularTimePeriod, method name: getFirstMillisecond
./jfree/data/time/junit/HourTests.java:132:        assertEquals(1014307200000L, h2.getFirstMillisecond(zone));
./jfree/data/time/junit/HourTests.java:150:        assertEquals(1014267600000L, h2.getFirstMillisecond(zone));
./jfree/data/time/junit/HourTests.java:260:     * Some checks for the getFirstMillisecond() method.
./jfree/data/time/junit/HourTests.java:268:        assertEquals(1143900000000L, h.getFirstMillisecond());
./jfree/data/time/junit/HourTests.java:274:     * Some checks for the getFirstMillisecond(TimeZone) method.
./jfree/data/time/junit/HourTests.java:279:        assertEquals(-623293200000L, h.getFirstMillisecond(zone));
./jfree/data/time/junit/HourTests.java:284:            h.getFirstMillisecond((TimeZone) null);
./jfree/data/time/junit/HourTests.java:293:     * Some checks for the getFirstMillisecond(TimeZone) method.
./jfree/data/time/junit/HourTests.java:299:        assertEquals(955764000000L, h.getFirstMillisecond(calendar));
./jfree/data/time/junit/HourTests.java:304:            h.getFirstMillisecond((Calendar) null);
./jfree/data/time/junit/TimeSeriesCollectionTests.java:165:        long start1 = today.getFirstMillisecond();
./jfree/data/time/junit/TimeSeriesCollectionTests.java:184:        long start2 = tomorrow.getFirstMillisecond();
./jfree/data/time/junit/TimeSeriesCollectionTests.java:203:        long start3 = yesterday.getFirstMillisecond();
./jfree/data/time/junit/MinuteTests.java:138:        assertEquals(1016729700000L, m2.getFirstMillisecond(zone));
./jfree/data/time/junit/MinuteTests.java:157:        assertEquals(1016700900000L, m2.getFirstMillisecond(zone));
./jfree/data/time/junit/MinuteTests.java:210:     * Some checks for the getFirstMillisecond() method.
./jfree/data/time/junit/MinuteTests.java:218:        assertEquals(1143902580000L, m.getFirstMillisecond());
./jfree/data/time/junit/MinuteTests.java:224:     * Some checks for the getFirstMillisecond(TimeZone) method.
./jfree/data/time/junit/MinuteTests.java:229:        assertEquals(-623289660000L, m.getFirstMillisecond(zone));
./jfree/data/time/junit/MinuteTests.java:234:            m.getFirstMillisecond((TimeZone) null);
./jfree/data/time/junit/MinuteTests.java:243:     * Some checks for the getFirstMillisecond(TimeZone) method.
./jfree/data/time/junit/MinuteTests.java:249:        assertEquals(955766400000L, m.getFirstMillisecond(calendar));
./jfree/data/time/junit/MinuteTests.java:254:            m.getFirstMillisecond((Calendar) null);
./jfree/data/time/junit/MillisecondTests.java:144:        assertEquals(1016729759123L, m2.getFirstMillisecond(zone));
./jfree/data/time/junit/MillisecondTests.java:163:        assertEquals(1016722559123L, m2.getFirstMillisecond(zone));
./jfree/data/time/junit/MillisecondTests.java:212:        assertEquals(ms.getFirstMillisecond(), ms.getMiddleMillisecond());
./jfree/data/time/junit/MillisecondTests.java:215:        assertEquals(ms.getFirstMillisecond(), ms.getMiddleMillisecond());
./jfree/data/time/junit/MillisecondTests.java:229:     * Some checks for the getFirstMillisecond() method.
./jfree/data/time/junit/MillisecondTests.java:237:        assertEquals(1143902595500L, m.getFirstMillisecond());
./jfree/data/time/junit/MillisecondTests.java:243:     * Some checks for the getFirstMillisecond(TimeZone) method.
./jfree/data/time/junit/MillisecondTests.java:248:        assertEquals(-623289609500L, m.getFirstMillisecond(zone));
./jfree/data/time/junit/MillisecondTests.java:253:            m.getFirstMillisecond((TimeZone) null);
./jfree/data/time/junit/MillisecondTests.java:262:     * Some checks for the getFirstMillisecond(TimeZone) method.
./jfree/data/time/junit/MillisecondTests.java:268:        assertEquals(955766455500L, m.getFirstMillisecond(calendar));
./jfree/data/time/junit/MillisecondTests.java:273:            m.getFirstMillisecond((Calendar) null);
./jfree/data/time/junit/DayTests.java:136:        assertEquals(1078099200000L, d2.getFirstMillisecond(zone));
./jfree/data/time/junit/DayTests.java:155:        assertEquals(1078092000000L, d2.getFirstMillisecond(zone));
./jfree/data/time/junit/DayTests.java:291:     * Some checks for the getFirstMillisecond() method.
./jfree/data/time/junit/DayTests.java:299:        assertEquals(5094000000L, d.getFirstMillisecond());
./jfree/data/time/junit/DayTests.java:305:     * Some checks for the getFirstMillisecond(TimeZone) method.
./jfree/data/time/junit/DayTests.java:310:        assertEquals(-621187200000L, d.getFirstMillisecond(zone));
./jfree/data/time/junit/DayTests.java:315:            d.getFirstMillisecond((TimeZone) null);
./jfree/data/time/junit/DayTests.java:324:     * Some checks for the getFirstMillisecond(TimeZone) method.
./jfree/data/time/junit/DayTests.java:330:        assertEquals(1007164800000L, d.getFirstMillisecond(calendar));
./jfree/data/time/junit/DayTests.java:335:            d.getFirstMillisecond((Calendar) null);
./jfree/data/time/junit/FixedMillisecondTests.java:137:    	assertEquals(20L, fm.getFirstMillisecond());
./jfree/data/time/junit/MonthTests.java:151:        assertEquals(951868800000L, m2.getFirstMillisecond(zone));
./jfree/data/time/junit/MonthTests.java:169:        assertEquals(951822000000L, m2.getFirstMillisecond(zone));
./jfree/data/time/junit/MonthTests.java:296:     * Some checks for the getFirstMillisecond() method.
./jfree/data/time/junit/MonthTests.java:304:        assertEquals(5094000000L, m.getFirstMillisecond());
./jfree/data/time/junit/MonthTests.java:310:     * Some checks for the getFirstMillisecond(TimeZone) method.
./jfree/data/time/junit/MonthTests.java:315:        assertEquals(-628444800000L, m.getFirstMillisecond(zone));
./jfree/data/time/junit/MonthTests.java:320:            m.getFirstMillisecond((TimeZone) null);
./jfree/data/time/junit/MonthTests.java:329:     * Some checks for the getFirstMillisecond(TimeZone) method.
./jfree/data/time/junit/MonthTests.java:335:        assertEquals(978307200000L, m.getFirstMillisecond(calendar));
./jfree/data/time/junit/MonthTests.java:340:            m.getFirstMillisecond((Calendar) null);
./jfree/data/time/junit/SecondTests.java:139:        assertEquals(1016729759000L, s2.getFirstMillisecond(zone));
./jfree/data/time/junit/SecondTests.java:157:        assertEquals(1016751359000L, s2.getFirstMillisecond(zone));
./jfree/data/time/junit/SecondTests.java:210:     * Some checks for the getFirstMillisecond() method.
./jfree/data/time/junit/SecondTests.java:218:        assertEquals(1143902595000L, s.getFirstMillisecond());
./jfree/data/time/junit/SecondTests.java:224:     * Some checks for the getFirstMillisecond(TimeZone) method.
./jfree/data/time/junit/SecondTests.java:229:        assertEquals(-623289610000L, s.getFirstMillisecond(zone));
./jfree/data/time/junit/SecondTests.java:234:            s.getFirstMillisecond((TimeZone) null);
./jfree/data/time/junit/SecondTests.java:243:     * Some checks for the getFirstMillisecond(TimeZone) method.
./jfree/data/time/junit/SecondTests.java:249:        assertEquals(955766455000L, s.getFirstMillisecond(calendar));
./jfree/data/time/junit/SecondTests.java:254:            s.getFirstMillisecond((Calendar) null);
./jfree/data/time/junit/YearTests.java:134:        assertEquals(1009843200000L, y2.getFirstMillisecond(zone));
./jfree/data/time/junit/YearTests.java:152:        assertEquals(1009872000000L, y2.getFirstMillisecond(zone));
./jfree/data/time/junit/YearTests.java:278:     * Some checks for the getFirstMillisecond() method.
./jfree/data/time/junit/YearTests.java:287:        assertEquals(-3600000L, y.getFirstMillisecond());
./jfree/data/time/junit/YearTests.java:293:     * Some checks for the getFirstMillisecond(TimeZone) method.
./jfree/data/time/junit/YearTests.java:298:        assertEquals(-631123200000L, y.getFirstMillisecond(zone));
./jfree/data/time/junit/YearTests.java:303:            y.getFirstMillisecond((TimeZone) null);
./jfree/data/time/junit/YearTests.java:312:     * Some checks for the getFirstMillisecond(TimeZone) method.
./jfree/data/time/junit/YearTests.java:318:        assertEquals(978307200000L, y.getFirstMillisecond(calendar));
./jfree/data/time/junit/YearTests.java:323:            y.getFirstMillisecond((Calendar) null);
./jfree/data/time/junit/WeekTests.java:240:        assertEquals(1104710400000L, w1.getFirstMillisecond(c1));
./jfree/data/time/junit/WeekTests.java:245:        assertEquals(1104706800000L, w1.getFirstMillisecond(c2));
./jfree/data/time/junit/WeekTests.java:249:        assertEquals(1104037200000L, w1.getFirstMillisecond(c3));
./jfree/data/time/junit/WeekTests.java:275:        assertEquals(1104105600000L, w1.getFirstMillisecond(c1));
./jfree/data/time/junit/WeekTests.java:280:        assertEquals(1104102000000L, w1.getFirstMillisecond(c2));
./jfree/data/time/junit/WeekTests.java:285:        assertEquals(1135486800000L, w1.getFirstMillisecond(c3));
./jfree/data/time/junit/WeekTests.java:326:     * Some checks for the getFirstMillisecond() method.
./jfree/data/time/junit/WeekTests.java:334:        assertEquals(946800000L, w.getFirstMillisecond());
./jfree/data/time/junit/WeekTests.java:340:     * Some checks for the getFirstMillisecond(TimeZone) method.
./jfree/data/time/junit/WeekTests.java:348:            assertEquals(-603302400000L, w.getFirstMillisecond(zone));
./jfree/data/time/junit/WeekTests.java:357:            w.getFirstMillisecond((TimeZone) null);
./jfree/data/time/junit/WeekTests.java:366:     * Some checks for the getFirstMillisecond(TimeZone) method.
./jfree/data/time/junit/WeekTests.java:372:        assertEquals(978307200000L, w.getFirstMillisecond(calendar));
./jfree/data/time/junit/WeekTests.java:377:            w.getFirstMillisecond((Calendar) null);
./jfree/data/time/junit/QuarterTests.java:146:        assertEquals(1017619200000L, q2.getFirstMillisecond(zone));
./jfree/data/time/junit/QuarterTests.java:164:        assertEquals(1017608400000L, q2.getFirstMillisecond(zone));
./jfree/data/time/junit/QuarterTests.java:316:     * Some checks for the getFirstMillisecond() method.
./jfree/data/time/junit/QuarterTests.java:324:        assertEquals(15634800000L, q.getFirstMillisecond());
./jfree/data/time/junit/QuarterTests.java:330:     * Some checks for the getFirstMillisecond(TimeZone) method.
./jfree/data/time/junit/QuarterTests.java:335:        assertEquals(-623347200000L, q.getFirstMillisecond(zone));
./jfree/data/time/junit/QuarterTests.java:340:            q.getFirstMillisecond((TimeZone) null);
./jfree/data/time/junit/QuarterTests.java:349:     * Some checks for the getFirstMillisecond(TimeZone) method.
./jfree/data/time/junit/QuarterTests.java:355:        assertEquals(978307200000L, q.getFirstMillisecond(calendar));
./jfree/data/time/junit/QuarterTests.java:360:            q.getFirstMillisecond((Calendar) null);

### Candidate class name: org.jfree.chart.axis.ValueAxis, method name: refreshTicks
not in /jfreechart/tests/org

### Candidate class name: org.jfree.chart.renderer.xy.XYBarRenderer, method name: drawItem
not in /jfreechart/tests/org

### Candidate class name: org.jfree.data.xy.AbstractIntervalXYDataset, method name: getItemCount
./jfree/data/xy/junit/YIntervalSeriesTests.java:213:        assertEquals(3, s1.getItemCount());
./jfree/data/xy/junit/DefaultIntervalXYDatasetTests.java:121:     * Some checks for the getItemCount() method.
./jfree/data/xy/junit/DefaultIntervalXYDatasetTests.java:125:        assertEquals(3, d.getItemCount(0));
./jfree/data/xy/junit/DefaultIntervalXYDatasetTests.java:126:        assertEquals(3, d.getItemCount(1));
./jfree/data/xy/junit/DefaultIntervalXYDatasetTests.java:131:            d.getItemCount(2);
./jfree/data/xy/junit/XIntervalSeriesTests.java:214:        assertEquals(3, s1.getItemCount());
./jfree/data/xy/junit/XYSeriesTests.java:260:        assertEquals(3, s1.getItemCount());
./jfree/data/xy/junit/XYSeriesTests.java:326:        assertEquals(1, series.getItemCount());
./jfree/data/xy/junit/XYSeriesTests.java:331:        assertEquals(2, series.getItemCount());
./jfree/data/xy/junit/XYSeriesTests.java:336:        assertEquals(2, series.getItemCount());
./jfree/data/xy/junit/XYSeriesTests.java:369:        assertEquals(3, series.getItemCount());
./jfree/data/xy/junit/XYSeriesTests.java:460:        assertEquals(4, dataset.getItemCount(0));
./jfree/data/xy/junit/VectorSeriesTests.java:213:        assertEquals(3, s1.getItemCount());
./jfree/data/xy/junit/TableXYDatasetTests.java:175:        assertEquals(6, dataset.getItemCount());
./jfree/data/xy/junit/TableXYDatasetTests.java:184:        assertEquals(7, dataset.getItemCount());
./jfree/data/xy/junit/TableXYDatasetTests.java:191:        assertEquals(7, dataset.getItemCount());
./jfree/data/xy/junit/TableXYDatasetTests.java:199:        assertEquals(4, dataset.getItemCount());
./jfree/data/xy/junit/TableXYDatasetTests.java:209:        assertEquals(4, dataset.getItemCount());
./jfree/data/xy/junit/TableXYDatasetTests.java:211:        assertEquals(0, dataset.getItemCount());
./jfree/data/xy/junit/TableXYDatasetTests.java:222:        assertEquals(5, dataset.getItemCount());
./jfree/data/xy/junit/TableXYDatasetTests.java:239:        assertEquals(4, dataset.getItemCount());
./jfree/data/xy/junit/TableXYDatasetTests.java:250:        assertEquals(2, dataset.getItemCount());  // should be 2 items
./jfree/data/xy/junit/TableXYDatasetTests.java:252:        assertEquals(2, dataset.getItemCount());  // still 2
./jfree/data/xy/junit/TableXYDatasetTests.java:254:        assertEquals(1, dataset.getItemCount());  // 1 value pruned.
./jfree/data/xy/junit/TableXYDatasetTests.java:259:        assertEquals(2, dataset2.getItemCount());  // should be 2 items
./jfree/data/xy/junit/TableXYDatasetTests.java:261:        assertEquals(2, dataset2.getItemCount());  // still 2
./jfree/data/xy/junit/TableXYDatasetTests.java:263:        assertEquals(1, dataset2.getItemCount());  // still 2.
./jfree/data/xy/junit/XYIntervalSeriesTests.java:214:        assertEquals(3, s1.getItemCount());

### Candidate class name: org.jfree.chart.plot.XYPlot, method name: findSubplot
not in /jfreechart/tests/org

### Candidate class name: org.jfree.chart.needle.MeterNeedle, method name: drawNeedle
not in /jfreechart/tests/org

### Candidate class name: org.jfree.chart.axis.ValueAxis, method name: draw
./jfree/chart/annotations/junit/XYDrawableAnnotationTests.java:80:        public void draw(Graphics2D g2, Rectangle2D area) {
./jfree/chart/plot/junit/PiePlot3DTests.java:144:            chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null);
./jfree/chart/plot/junit/PiePlotTests.java:655:            chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null);
./jfree/chart/plot/junit/CombinedDomainXYPlotTests.java:202:        chart.draw(g2, new Rectangle2D.Double(0.0, 0.0, 200.0, 100.0));
./jfree/chart/plot/junit/CategoryPlotTests.java:817:            chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null);
./jfree/chart/plot/junit/CombinedDomainCategoryPlotTests.java:190:        chart.draw(g2, new Rectangle2D.Double(0.0, 0.0, 200.0, 100.0));
./jfree/chart/plot/junit/XYPlotTests.java:960:            chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null);
./jfree/chart/plot/junit/XYPlotTests.java:986:            chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null);
./jfree/chart/plot/junit/XYPlotTests.java:1012:            chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null);
./jfree/chart/plot/junit/SpiderWebPlotTests.java:362:            chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null);
./jfree/chart/plot/junit/CombinedRangeCategoryPlotTests.java:191:        chart.draw(g2, new Rectangle2D.Double(0.0, 0.0, 200.0, 100.0));
./jfree/chart/plot/junit/CombinedRangeXYPlotTests.java:194:        chart.draw(g2, new Rectangle2D.Double(0.0, 0.0, 200.0, 100.0));
./jfree/chart/renderer/category/junit/BoxAndWhiskerRendererTests.java:254:            chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
./jfree/chart/renderer/category/junit/BoxAndWhiskerRendererTests.java:297:            chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
./jfree/chart/renderer/xy/junit/StandardXYItemRendererTests.java:296:        chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, info);
./jfree/chart/renderer/xy/junit/StackedXYAreaRenderer2Tests.java:109:            chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null);
./jfree/chart/junit/StackedBarChart3DTests.java:111:            this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
./jfree/chart/junit/MeterChartTests.java:93:            chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null);
./jfree/chart/junit/XYLineChartTests.java:110:            this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
./jfree/chart/junit/StackedBarChartTests.java:116:            this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
./jfree/chart/junit/XYAreaChartTests.java:110:            this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
./jfree/chart/junit/XYStepAreaChartTests.java:110:            this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
./jfree/chart/junit/BarChartTests.java:115:            this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
./jfree/chart/junit/WaterfallChartTests.java:108:            this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
./jfree/chart/junit/LineChartTests.java:111:            this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
./jfree/chart/junit/GanttChartTests.java:112:            this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
./jfree/chart/junit/XYBarChartTests.java:112:            this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
./jfree/chart/junit/XYStepChartTests.java:110:            this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
./jfree/chart/junit/AreaChartTests.java:138:            this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
./jfree/chart/junit/LineChart3DTests.java:111:            this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
./jfree/chart/junit/ScatterPlotTests.java:113:            this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
./jfree/chart/junit/TimeSeriesChartTests.java:109:            this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
./jfree/chart/junit/BarChart3DTests.java:113:            this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
./jfree/chart/junit/StackedAreaChartTests.java:111:            this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null,
./jfree/chart/junit/PieChart3DTests.java:126:            chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null);

### Candidate class name: org.jfree.chart.axis.ValueAxis, method name: valueToJava2D
./jfree/chart/axis/junit/LogarithmicAxisTests.java:248:                  + "range.", plotArea.getX(), this.axis.valueToJava2D(
./jfree/chart/axis/junit/LogarithmicAxisTests.java:252:                  this.axis.valueToJava2D(this.axis.getUpperBound(),
./jfree/chart/axis/junit/LogarithmicAxisTests.java:256:                  this.axis.valueToJava2D(Math.sqrt(this.axis.getLowerBound()

### Candidate class name: org.jfree.chart.plot.CategoryPlot, method name: plotChanged
./jfree/chart/plot/dial/junit/DialPlotTests.java:78:    public void plotChanged(PlotChangeEvent event) {
./jfree/chart/plot/junit/MyPlotChangeListener.java:83:    public void plotChanged(PlotChangeEvent e) {
./jfree/chart/plot/junit/MultiplePiePlotTests.java:87:    public void plotChanged(PlotChangeEvent event) {

### Candidate class name: org.jfree.data.time.RegularTimePeriod, method name: getLastMillisecond
not in /jfreechart/tests/org

### Candidate class name: org.jfree.data.time.RegularTimePeriod, method name: peg
not in /jfreechart/tests/org

### Candidate class name: javax.swing.table.AbstractTableModel, method name: isCellEditable
not in /jfreechart/tests/org

### Candidate class name: org.jfree.chart.title.Title, method name: arrange
./jfree/chart/title/junit/ImageTitleTests.java:149:        Size2D s = t.arrange(g2);
./jfree/chart/title/junit/ImageTitleTests.java:154:        s = t.arrange(g2);
./jfree/chart/title/junit/ImageTitleTests.java:159:        s = t.arrange(g2);

### Candidate class name: org.jfree.chart.plot.XYPlot, method name: setRenderer
./jfree/chart/plot/junit/XYPlotTests.java:220:        plot1.setRenderer(new DefaultXYItemRenderer());
./jfree/chart/plot/junit/XYPlotTests.java:222:        plot2.setRenderer(new DefaultXYItemRenderer());
./jfree/chart/plot/junit/XYPlotTests.java:226:        plot1.setRenderer(11, new DefaultXYItemRenderer());
./jfree/chart/plot/junit/XYPlotTests.java:228:        plot2.setRenderer(11, new DefaultXYItemRenderer());
./jfree/chart/plot/junit/XYPlotTests.java:415:        p1.setRenderer(1, new XYBarRenderer());
./jfree/chart/plot/junit/XYPlotTests.java:483:        p1.setRenderer(1, new XYBarRenderer());
./jfree/chart/plot/junit/XYPlotTests.java:555:            plot.setRenderer(null);
./jfree/chart/plot/junit/XYPlotTests.java:752:        p1.setRenderer(1, renderer2);
./jfree/chart/plot/junit/XYPlotTests.java:806:        plot.setRenderer(0, r0);
./jfree/chart/plot/junit/XYPlotTests.java:808:        plot.setRenderer(2, r2);
./jfree/chart/plot/junit/XYPlotTests.java:828:        plot.setRenderer(0, r0);
./jfree/chart/plot/junit/XYPlotTests.java:883:        plot.setRenderer(renderer);
./jfree/chart/plot/junit/XYPlotTests.java:954:        plot.setRenderer(1, new XYLineAndShapeRenderer());
./jfree/chart/plot/junit/XYPlotTests.java:980:        plot.setRenderer(null);

### Candidate class name: org.jfree.chart.plot.CategoryPlot, method name: setGap
./jfree/chart/plot/junit/ThermometerPlotTests.java:192:        p1.setGap(7);
./jfree/chart/plot/junit/ThermometerPlotTests.java:194:        p2.setGap(7);
./jfree/chart/plot/junit/CombinedDomainXYPlotTests.java:313:        plot.setGap(10.0);
./jfree/chart/plot/junit/CombinedRangeXYPlotTests.java:305:        plot.setGap(10.0);

### Candidate class name: org.jfree.chart.plot.XYPlot, method name: handleClick
not in /jfreechart/tests/org

### Candidate class name: org.jfree.chart.plot.CategoryPlot, method name: getDataRange
not in /jfreechart/tests/org

### Candidate class name: org.jfree.chart.axis.ValueAxis, method name: java2DToValue
./jfree/chart/axis/junit/NumberAxisTests.java:178:        double y1 = axis.java2DToValue(75.0, dataArea, RectangleEdge.LEFT);  
./jfree/chart/axis/junit/NumberAxisTests.java:180:        double y2 = axis.java2DToValue(75.0, dataArea, RectangleEdge.RIGHT);   
./jfree/chart/axis/junit/NumberAxisTests.java:182:        double x1 = axis.java2DToValue(75.0, dataArea, RectangleEdge.TOP);   
./jfree/chart/axis/junit/NumberAxisTests.java:184:        double x2 = axis.java2DToValue(75.0, dataArea, RectangleEdge.BOTTOM);   
./jfree/chart/axis/junit/NumberAxisTests.java:187:        double y3 = axis.java2DToValue(75.0, dataArea, RectangleEdge.LEFT);  
./jfree/chart/axis/junit/NumberAxisTests.java:189:        double y4 = axis.java2DToValue(75.0, dataArea, RectangleEdge.RIGHT);   
./jfree/chart/axis/junit/NumberAxisTests.java:191:        double x3 = axis.java2DToValue(75.0, dataArea, RectangleEdge.TOP);   
./jfree/chart/axis/junit/NumberAxisTests.java:193:        double x4 = axis.java2DToValue(75.0, dataArea, RectangleEdge.BOTTOM);   
./jfree/chart/axis/junit/LogarithmicAxisTests.java:265:                 this.axis.getUpperBound(), this.axis.java2DToValue(
./jfree/chart/axis/junit/LogarithmicAxisTests.java:271:                 this.axis.java2DToValue(plotArea.getX(), plotArea, edge),
./jfree/chart/axis/junit/LogarithmicAxisTests.java:276:                 * this.axis.getLowerBound()), this.axis.java2DToValue(
./jfree/chart/axis/junit/LogAxisTests.java:152:        double y1 = axis.java2DToValue(75.0, dataArea, RectangleEdge.LEFT);
./jfree/chart/axis/junit/LogAxisTests.java:154:        double y2 = axis.java2DToValue(75.0, dataArea, RectangleEdge.RIGHT);
./jfree/chart/axis/junit/LogAxisTests.java:156:        double x1 = axis.java2DToValue(75.0, dataArea, RectangleEdge.TOP);
./jfree/chart/axis/junit/LogAxisTests.java:158:        double x2 = axis.java2DToValue(75.0, dataArea, RectangleEdge.BOTTOM);
./jfree/chart/axis/junit/LogAxisTests.java:161:        double y3 = axis.java2DToValue(75.0, dataArea, RectangleEdge.LEFT);
./jfree/chart/axis/junit/LogAxisTests.java:163:        double y4 = axis.java2DToValue(75.0, dataArea, RectangleEdge.RIGHT);
./jfree/chart/axis/junit/LogAxisTests.java:165:        double x3 = axis.java2DToValue(75.0, dataArea, RectangleEdge.TOP);
./jfree/chart/axis/junit/LogAxisTests.java:167:        double x4 = axis.java2DToValue(75.0, dataArea, RectangleEdge.BOTTOM);
./jfree/chart/axis/junit/DateAxisTests.java:276:        double y1 = axis.java2DToValue(75.0, dataArea, RectangleEdge.LEFT);  
./jfree/chart/axis/junit/DateAxisTests.java:278:        double y2 = axis.java2DToValue(75.0, dataArea, RectangleEdge.RIGHT);   
./jfree/chart/axis/junit/DateAxisTests.java:280:        double x1 = axis.java2DToValue(75.0, dataArea, RectangleEdge.TOP);   
./jfree/chart/axis/junit/DateAxisTests.java:282:        double x2 = axis.java2DToValue(75.0, dataArea, RectangleEdge.BOTTOM);   
./jfree/chart/axis/junit/DateAxisTests.java:285:        double y3 = axis.java2DToValue(75.0, dataArea, RectangleEdge.LEFT);  
./jfree/chart/axis/junit/DateAxisTests.java:287:        double y4 = axis.java2DToValue(75.0, dataArea, RectangleEdge.RIGHT);   
./jfree/chart/axis/junit/DateAxisTests.java:289:        double x3 = axis.java2DToValue(75.0, dataArea, RectangleEdge.TOP);   
./jfree/chart/axis/junit/DateAxisTests.java:291:        double x4 = axis.java2DToValue(75.0, dataArea, RectangleEdge.BOTTOM);   
