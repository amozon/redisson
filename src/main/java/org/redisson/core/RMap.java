/**
 * Copyright 2014 Nikita Koksharov, Nickolay Borbit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.redisson.core;

import io.netty.util.concurrent.Future;

import java.util.concurrent.ConcurrentMap;

/**
 * Distributed and concurrent implementation of {@link java.util.concurrent.ConcurrentMap}
 * and {@link java.util.Map}
 *
 * @author Nikita Koksharov
 *
 * @param <K> key
 * @param <V> value
 */
public interface RMap<K, V> extends ConcurrentMap<K, V>, RExpirable {

    long fastRemove(K ... keys);
    
    Future<Long> fastRemoveAsync(K ... keys);
    
    Future<Boolean> fastPutAsync(K key, V value);
    
    boolean fastPut(K key, V value);
    
    Future<V> getAsync(K key);

    Future<V> putAsync(K key, V value);

    Future<V> removeAsync(K key);

}
