/*
 * Copyright 2016 Elizabeth Harper
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
package io.vulpine.lib.vol;

/**
 * Volatile Double Container
 *
 * @author Elizabeth Harper [elliefops@gmail.com]
 * @version 1.0
 * @since 0.0.1
 */
public class VolatileDouble
{
  private volatile double value;

  public VolatileDouble( final double value )
  {
    set(value);
  }

  public VolatileDouble()
  {
  }

  public double get()
  {
   return value;
  }

  public synchronized void set ( final double v )
  {
    value = v;
  }

  public void increment()
  {
    set(value + 1D);
  }

  public void decrement()
  {
    set(value - 1D);
  }

  public void increment( final double v )
  {
    set(value + v);
  }

  public void decrement( final double v )
  {
    set(value - v);
  }
}
