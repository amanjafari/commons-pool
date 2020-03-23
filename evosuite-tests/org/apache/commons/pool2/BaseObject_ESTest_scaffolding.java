/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Mar 19 17:27:09 KST 2020
 */

package org.apache.commons.pool2;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class BaseObject_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.pool2.BaseObject"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 


  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BaseObject_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.pool2.impl.BaseGenericObjectPool$StatsStore",
      "org.apache.commons.pool2.impl.DefaultEvictionPolicy",
      "org.apache.commons.pool2.impl.BaseGenericObjectPool",
      "org.apache.commons.pool2.impl.GenericKeyedObjectPool",
      "org.apache.commons.pool2.PooledObject",
      "org.apache.commons.pool2.impl.BaseObjectPoolConfig",
      "org.apache.commons.pool2.impl.EvictionTimer",
      "org.apache.commons.pool2.impl.GenericKeyedObjectPoolMXBean",
      "org.apache.commons.pool2.KeyedObjectPool",
      "org.apache.commons.pool2.KeyedPooledObjectFactory",
      "org.apache.commons.pool2.impl.EvictionPolicy",
      "org.apache.commons.pool2.SwallowedExceptionListener",
      "org.apache.commons.pool2.impl.DefaultPooledObjectInfo",
      "org.apache.commons.pool2.impl.DefaultPooledObjectInfoMBean",
      "org.apache.commons.pool2.BaseObject",
      "org.apache.commons.pool2.impl.GenericKeyedObjectPoolConfig"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.pool2.KeyedPooledObjectFactory", false, BaseObject_ESTest_scaffolding.class.getClassLoader()));
  }
}