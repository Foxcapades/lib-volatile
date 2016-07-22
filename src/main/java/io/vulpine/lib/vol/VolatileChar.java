package io.vulpine.lib.vol;

public class VolatileChar
{
  private volatile char value;

  public VolatileChar( final char value )
  {
    set(value);
  }

  public VolatileChar()
  {
  }

  public char get()
  {
    return value;
  }

  public synchronized void set( final char v )
  {
    value = v;
  }
}
