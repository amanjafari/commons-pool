/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 19 17:35:43 KST 2020
 */

package org.apache.commons.pool2;

import static org.evosuite.runtime.EvoAssertions.verifyException;
import static org.evosuite.shaded.org.mockito.ArgumentMatchers.nullable;
import static org.evosuite.shaded.org.mockito.Mockito.doReturn;
import static org.evosuite.shaded.org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.ref.SoftReference;
import java.util.NoSuchElementException;

import org.apache.commons.pool2.impl.AbandonedConfig;
import org.apache.commons.pool2.impl.DefaultPooledObject;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.apache.commons.pool2.impl.PooledSoftReference;
import org.apache.commons.pool2.impl.SoftReferenceObjectPool;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true, separateClassLoader = true, useJEE = true) 
public class ObjectPool_ESTest extends ObjectPool_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PooledObjectFactory<Object> pooledObjectFactory0 = (PooledObjectFactory<Object>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      GenericObjectPool<Object> genericObjectPool0 = new GenericObjectPool<Object>(pooledObjectFactory0, genericObjectPoolConfig0);
      genericObjectPool0.addObjects((-1));
      assertEquals((-1L), genericObjectPool0.getMaxWaitMillis());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PooledObjectFactory<Object> pooledObjectFactory0 = (PooledObjectFactory<Object>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      AbandonedConfig abandonedConfig0 = new AbandonedConfig();
      GenericObjectPool<Object> genericObjectPool0 = new GenericObjectPool<Object>(pooledObjectFactory0, genericObjectPoolConfig0, abandonedConfig0);
      Integer integer0 = new Integer(0);
      genericObjectPool0.returnObject(integer0);
      assertFalse(genericObjectPool0.getTestOnBorrow());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer(0);
      DefaultPooledObject<Integer> defaultPooledObject0 = new DefaultPooledObject<Integer>(integer0);
      PooledObjectFactory<Integer> pooledObjectFactory0 = (PooledObjectFactory<Integer>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn(defaultPooledObject0, (PooledObject) null).when(pooledObjectFactory0).makeObject();
      doReturn(false).when(pooledObjectFactory0).validateObject(nullable(org.apache.commons.pool2.PooledObject.class));
      SoftReferenceObjectPool<Integer> softReferenceObjectPool0 = new SoftReferenceObjectPool<Integer>(pooledObjectFactory0);
      try { 
        softReferenceObjectPool0.addObjects(3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.pool2.impl.SoftReferenceObjectPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DefaultPooledObject<Object> defaultPooledObject0 = new DefaultPooledObject<Object>("");
      PooledObjectFactory<Object> pooledObjectFactory0 = (PooledObjectFactory<Object>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn(defaultPooledObject0).when(pooledObjectFactory0).makeObject();
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      GenericObjectPool<Object> genericObjectPool0 = new GenericObjectPool<Object>(pooledObjectFactory0, genericObjectPoolConfig0);
      genericObjectPool0.addObject();
      assertEquals(0L, genericObjectPool0.getReturnedCount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PooledObjectFactory<Integer> pooledObjectFactory0 = (PooledObjectFactory<Integer>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      SoftReferenceObjectPool<Integer> softReferenceObjectPool0 = new SoftReferenceObjectPool<Integer>(pooledObjectFactory0);
      softReferenceObjectPool0.close();
      assertTrue(softReferenceObjectPool0.isClosed());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PooledObjectFactory<Integer> pooledObjectFactory0 = (PooledObjectFactory<Integer>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      SoftReferenceObjectPool<Integer> softReferenceObjectPool0 = new SoftReferenceObjectPool<Integer>(pooledObjectFactory0);
      softReferenceObjectPool0.clear();
      assertEquals(0, softReferenceObjectPool0.getNumActive());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PooledObjectFactory<Object> pooledObjectFactory0 = (PooledObjectFactory<Object>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      GenericObjectPool<Object> genericObjectPool0 = new GenericObjectPool<Object>(pooledObjectFactory0);
      int int0 = genericObjectPool0.getNumIdle();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SoftReferenceObjectPool<Object> softReferenceObjectPool0 = new SoftReferenceObjectPool<Object>((PooledObjectFactory<Object>) null);
      int int0 = softReferenceObjectPool0.getNumActive();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SoftReference<String> softReference0 = new SoftReference<String>("");
      PooledSoftReference<String> pooledSoftReference0 = new PooledSoftReference<String>(softReference0);
      PooledObjectFactory<String> pooledObjectFactory0 = (PooledObjectFactory<String>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn(pooledSoftReference0, (PooledObject) null).when(pooledObjectFactory0).makeObject();
      SoftReferenceObjectPool<String> softReferenceObjectPool0 = new SoftReferenceObjectPool<String>(pooledObjectFactory0);
      PooledObjectFactory<String> pooledObjectFactory1 = softReferenceObjectPool0.getFactory();
      GenericObjectPool<String> genericObjectPool0 = new GenericObjectPool<String>(pooledObjectFactory1);
      try { 
        genericObjectPool0.addObjects(2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.pool2.impl.GenericObjectPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer(0);
      DefaultPooledObject<Integer> defaultPooledObject0 = new DefaultPooledObject<Integer>(integer0);
      PooledObjectFactory<Integer> pooledObjectFactory0 = (PooledObjectFactory<Integer>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn(defaultPooledObject0).when(pooledObjectFactory0).makeObject();
      GenericObjectPoolConfig<Integer> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Integer>();
      AbandonedConfig abandonedConfig0 = new AbandonedConfig();
      GenericObjectPool<Integer> genericObjectPool0 = new GenericObjectPool<Integer>(pooledObjectFactory0, genericObjectPoolConfig0, abandonedConfig0);
      Integer integer1 = genericObjectPool0.borrowObject();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PooledObjectFactory<Object> pooledObjectFactory0 = (PooledObjectFactory<Object>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      GenericObjectPool<Object> genericObjectPool0 = new GenericObjectPool<Object>(pooledObjectFactory0);
      Integer integer0 = new Integer(0);
      try { 
        genericObjectPool0.returnObject(integer0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Returned object not currently part of this pool
         //
         verifyException("org.apache.commons.pool2.impl.GenericObjectPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PooledObjectFactory<Object> pooledObjectFactory0 = (PooledObjectFactory<Object>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      GenericObjectPool<Object> genericObjectPool0 = new GenericObjectPool<Object>(pooledObjectFactory0);
      try { 
        genericObjectPool0.invalidateObject("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Invalidated object not currently part of this pool
         //
         verifyException("org.apache.commons.pool2.impl.GenericObjectPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SoftReferenceObjectPool<String> softReferenceObjectPool0 = new SoftReferenceObjectPool<String>((PooledObjectFactory<String>) null);
      try { 
        softReferenceObjectPool0.borrowObject();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.pool2.impl.SoftReferenceObjectPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PooledObjectFactory<Object> pooledObjectFactory0 = (PooledObjectFactory<Object>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn((PooledObject) null).when(pooledObjectFactory0).makeObject();
      GenericObjectPoolConfig<Object> genericObjectPoolConfig0 = new GenericObjectPoolConfig<Object>();
      GenericObjectPool<Object> genericObjectPool0 = new GenericObjectPool<Object>(pooledObjectFactory0, genericObjectPoolConfig0);
      try { 
        genericObjectPool0.borrowObject();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.pool2.impl.GenericObjectPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PooledObjectFactory<String> pooledObjectFactory0 = (PooledObjectFactory<String>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn((PooledObject) null).when(pooledObjectFactory0).makeObject();
      SoftReferenceObjectPool<String> softReferenceObjectPool0 = new SoftReferenceObjectPool<String>(pooledObjectFactory0);
      PooledObjectFactory<String> pooledObjectFactory1 = softReferenceObjectPool0.getFactory();
      GenericObjectPool<String> genericObjectPool0 = new GenericObjectPool<String>(pooledObjectFactory1);
      try { 
        genericObjectPool0.addObjects(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.pool2.impl.GenericObjectPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PooledObjectFactory<Object> pooledObjectFactory0 = (PooledObjectFactory<Object>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      GenericObjectPool<Object> genericObjectPool0 = new GenericObjectPool<Object>(pooledObjectFactory0);
      genericObjectPool0.close();
      try { 
        genericObjectPool0.addObjects(1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Pool not open
         //
         verifyException("org.apache.commons.pool2.impl.BaseGenericObjectPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PooledObjectFactory<String> pooledObjectFactory0 = (PooledObjectFactory<String>) mock(PooledObjectFactory.class, new ViolatedAssumptionAnswer());
      doReturn((PooledObject) null).when(pooledObjectFactory0).makeObject();
      SoftReferenceObjectPool<String> softReferenceObjectPool0 = new SoftReferenceObjectPool<String>(pooledObjectFactory0);
      PooledObjectFactory<String> pooledObjectFactory1 = softReferenceObjectPool0.getFactory();
      GenericObjectPoolConfig<String> genericObjectPoolConfig0 = new GenericObjectPoolConfig<String>();
      AbandonedConfig abandonedConfig0 = new AbandonedConfig();
      GenericObjectPool<String> genericObjectPool0 = new GenericObjectPool<String>(pooledObjectFactory1, genericObjectPoolConfig0, abandonedConfig0);
      try { 
        genericObjectPool0.addObject();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.pool2.impl.GenericObjectPool", e);
      }
  }
}
