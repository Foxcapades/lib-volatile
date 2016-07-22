package io.vulpine.lib.vol;

public class VolatileInt
{
  private volatile int value;

  public VolatileInt( final int value )
  {
    set(value);
  }

  public VolatileInt()
  {
  }

  public int get()
  {
    return value;
  }

  public synchronized void set( final int v )
  {
    value = v;
  }

  public void increment()
  {
    set(value + 1);
  }

  public void decrement()
  {
    set(value - 1);
  }

  public void increment( final int v )
  {
    set(value + v);
  }

  public void decrement( final int v )
  {
    set(value - v);
  }
}
