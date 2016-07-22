package io.vulpine.lib.vol;

public class VolatileBoolean
{
  private volatile boolean value;

  public VolatileBoolean( final boolean value )
  {
    set(value);
  }

  public VolatileBoolean()
  {
  }

  public boolean get()
  {
    return value;
  }

  public synchronized void set( final boolean v )
  {
    value = v;
  }

  public void flip()
  {
    set(!value);
  }
}
