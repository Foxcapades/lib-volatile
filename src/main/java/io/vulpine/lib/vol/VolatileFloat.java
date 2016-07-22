package io.vulpine.lib.vol;

public class VolatileFloat
{
  private volatile float value;

  public VolatileFloat( final float value )
  {
    set(value);
  }

  public VolatileFloat()
  {
  }

  public double get()
  {
    return value;
  }

  public synchronized void set ( final float v )
  {
    value = v;
  }

  public void increment()
  {
    set(value + 1F);
  }

  public void decrement()
  {
    set(value - 1F);
  }

  public void increment( final float v )
  {
    set(value + v);
  }

  public void decrement( final float v )
  {
    set(value - v);
  }

}
