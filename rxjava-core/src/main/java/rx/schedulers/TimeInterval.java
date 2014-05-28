/**
 * Copyright 2014 Netflix, Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rx.schedulers;

/**
 * @warn javadoc class description missing
 */
public class TimeInterval<T> {
    private final long intervalInMilliseconds;
    private final T value;

    public TimeInterval(long intervalInMilliseconds, T value) {
        this.value = value;
        this.intervalInMilliseconds = intervalInMilliseconds;
    }

    /**
     * Returns the interval, expressed in milliseconds.
     * 
     * @return the interval in milliseconds
     */
    public long getIntervalInMilliseconds() {
        return intervalInMilliseconds;
    }

    /**
     * @warn javadoc missing
     * @return
     */
    public T getValue() {
        return value;
    }

    // The following methods are generated by eclipse automatically.
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime
                * result
                + (int) (intervalInMilliseconds ^ (intervalInMilliseconds >>> 32));
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TimeInterval<?> other = (TimeInterval<?>) obj;
        if (intervalInMilliseconds != other.intervalInMilliseconds)
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "TimeInterval [intervalInMilliseconds=" + intervalInMilliseconds
                + ", value=" + value + "]";
    }
}
