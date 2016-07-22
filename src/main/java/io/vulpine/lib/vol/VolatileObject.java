package io.vulpine.lib.vol;

public class VolatileObject< T > implements ObjectContainer < T >
{
  private volatile T value;

  public VolatileObject() {}

  public VolatileObject( final T v )
  {
    set(v);
  }

  public T get()
  {
    return value;
  }

  public synchronized void set( final T v )
  {
    value = v;
  }
}
