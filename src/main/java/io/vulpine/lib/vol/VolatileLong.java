package io.vulpine.lib.vol;

public class VolatileLong
{
  private volatile long value;

  public VolatileLong( final long value )
  {
    set(value);
  }

  public VolatileLong()
  {
  }

  public long get()
  {
    return value;
  }

  public synchronized void set( final long v )
  {
    value = v;
  }

  public void increment()
  {
    set(value + 1L);
  }

  public void decrement()
  {
    set(value - 1L);
  }

  public void increment( final long v )
  {
    set(value + v);
  }

  public void decrement( final long v )
  {
    set(value - v);
  }

}
