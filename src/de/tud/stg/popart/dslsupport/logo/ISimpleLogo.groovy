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
package de.tud.stg.popart.dslsupport.logo;

import de.tud.stg.popart.dslsupport.*;
import org.javalogo.*;
import java.awt.Color;

/**
 * This interface defines the logo toy language.
 */
interface ISimpleLogo extends DSL {
	/* Literals */
	int getBlack();
	int getBlue();
	int getRed();
	int getGreen();
	int getYellow();
	int getWhite();
		
	/* Operations */
	void forward(int n);
	void backward(int n);
	void right(int n);
	void left(int n);
	
	/* Abstraction Operators */
	void turtle(HashMap params, Closure coreography);	
}