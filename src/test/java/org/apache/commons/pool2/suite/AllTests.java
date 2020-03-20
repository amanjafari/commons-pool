package org.apache.commons.pool2.suite;

import org.apache.commons.pool2.BaseKeyedPooledObjectFactory_ESTest;
import org.apache.commons.pool2.BaseObjectPool_ESTest;
import org.apache.commons.pool2.BaseObject_ESTest;
import org.apache.commons.pool2.BasePooledObjectFactory_ESTest;
import org.apache.commons.pool2.KeyedObjectPool_ESTest;
import org.apache.commons.pool2.KeyedPooledObjectFactory_ESTest;
import org.apache.commons.pool2.ObjectPool_ESTest;
import org.apache.commons.pool2.PoolUtils_ESTest;
import org.apache.commons.pool2.PooledObjectFactory_ESTest;
import org.apache.commons.pool2.PooledObjectState_ESTest;
import org.apache.commons.pool2.PooledObject_ESTest;
import org.apache.commons.pool2.SwallowedExceptionListener_ESTest;
import org.apache.commons.pool2.TrackedUse_ESTest;
import org.apache.commons.pool2.UsageTracking_ESTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses( {
			BaseKeyedPooledObjectFactory_ESTest.class,
			BaseObject_ESTest.class,
			BaseObjectPool_ESTest.class,
			BasePooledObjectFactory_ESTest.class,
			KeyedObjectPool_ESTest.class,
			KeyedPooledObjectFactory_ESTest.class,
			ObjectPool_ESTest.class,
			PooledObject_ESTest.class,
			PooledObjectFactory_ESTest.class,
			PooledObjectState_ESTest.class,
			PoolUtils_ESTest.class,
			SwallowedExceptionListener_ESTest.class,
			TrackedUse_ESTest.class,
			UsageTracking_ESTest.class
			})
public class AllTests {

}
