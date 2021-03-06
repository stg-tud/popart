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
package de.tud.stg.popart.aspect.extensions.itd.structuredesignators;

/**
 * This StructureDesignator matches instances of the given Packages classes
 * only. Subpackages are not accounted for.
 * @author Joscha Drechsler
 */
public class PackageHierarchySD extends StructureDesignator{
	/**
	 * The package
	 */
	private Package p;
	
	/**
	 * Constructor
	 * @param p the Package
	 */
	public PackageHierarchySD(Package p){
		super("SubPackage("+p+")");
		this.p=p;
	}
	
	/**
	 * @return <code>true</code> if the given objects classes package
	 * name is within the package hierarchy of the stored package.
	 */
	public boolean matches(Class<?> c){
		Package pckg = c.getPackage();
		if(pckg == null) return false;
		return pckg.equals(p) || pckg.getName().startsWith(p.getName()+".");
	}
}
