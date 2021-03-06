///////////////////////////////////////////////////////////////////////////////
// Copyright 2008-2015, Technische Universitaet Darmstadt (TUD), Germany
//
// The TUD licenses this file to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//  http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
///////////////////////////////////////////////////////////////////////////////
package de.tud.stg.tests.interactions.popart.priority;

import junit.framework.TestCase;
import java.lang.reflect.Method;
import de.tud.stg.popart.aspect.*;
import de.tud.stg.popart.aspect.extensions.*;
import de.tud.stg.popart.aspect.AspectFactory;

import de.tud.stg.popart.aspect.AspectManager;
import de.tud.stg.popart.aspect.extensions.Booter;
import de.tud.stg.popart.dslsupport.DSLException; 

/**
 * @author Tom Dinkelaker 
 **/
public class TestPriority extends TestPattern {
	
	public void testPriorityBefore() {
		initialize();
		ArrayList<Integer> priorityList = [0, 1];
		generateAspects(2,priorityList);
		System.out.println(separationLine);
		expectedResults = [2, 1, 0]
		println "Test Before. Priorities $priorityList"
		testPattern("Before", expectedResults, testObject);
		unregister();
	}
	
	public void testPriorityBefore2() {
		initialize();
		ArrayList<Integer> priorityList = [1, 0];
		generateAspects(2,priorityList);
		System.out.println(separationLine);
		expectedResults = [1, 2 , 0]
		println "Test Before. Priorities $priorityList"
		testPattern("Before", expectedResults, testObject);
		unregister();
	}
	
	public void testPriorityAfter() {
		initialize();
		ArrayList<Integer> priorityList = [0, 1];
		generateAspects(2,priorityList);
		System.out.println(separationLine);
		expectedResults = [0, 1, 2]
		println "Test After. Priorities $priorityList"
		testPattern("After", expectedResults, testObject);
		unregister();
	}
	
	public void testPriorityAfter2() {
		initialize();
		ArrayList<Integer> priorityList = [1, 0];
		generateAspects(2,priorityList);
		System.out.println(separationLine);
		expectedResults = [0, 2, 1]
		println "Test After 2. Priorities $priorityList"
		testPattern("After", expectedResults, testObject);
		unregister();
	}
	
	
}




