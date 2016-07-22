package io.vulpine.lib.vol;

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
