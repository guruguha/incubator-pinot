/**
 * Copyright (C) 2014-2015 LinkedIn Corp. (pinot-core@linkedin.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.linkedin.pinot.core.segment.index.readers;

import java.io.IOException;

import org.roaringbitmap.buffer.ImmutableRoaringBitmap;

import com.linkedin.pinot.common.utils.Pairs.IntPair;


public interface InvertedIndexReader {

  /**
   * Returns the immutable bitmap at the specified index.
   * @param idx the index
   * @return the immutable bitmap at the specified index.
   */
  public ImmutableRoaringBitmap getImmutable(int idx);

  /**
   *
   * @param docId
   * @return
   */
  public IntPair getMinMaxRangeFor(int docId);

  public void close() throws IOException;
}
