package io.vulpine.lib.vol;

public class VolatilePair < K, V >
{
  private volatile K key;
  private volatile V value;

  public VolatilePair( final K key, final V value )
  {
    setKey(key);
    setValue(value);
  }

  public VolatilePair()
  {
  }

  public K getKey()
  {
    return key;
  }

  public synchronized void setKey( final K key )
  {
    this.key = key;
  }

  public V getValue()
  {
    return value;
  }

  public synchronized void setValue( final V value )
  {
    this.value = value;
  }
}
