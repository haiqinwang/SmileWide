/*
             Licensed to the DARPA XDATA project.
       DARPA XDATA licenses this file to you under the 
         Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
           You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
                 either express or implied.                    
   See the License for the specific language governing
     permissions and limitations under the License.
*/
package smile.wide.algorithms;

import smile.wide.Network;
import smile.wide.data.DataSet;

/** Top-level abstract class for structure learning algorithms 
 * @author m.a.dejongh@gmail.com
 */
public abstract class StructureLearning {
	/** basic learn function to be called 
	 * @param data general data set class to be used as input
	 * @return returns an instance of the Network class 
	 * that contains a Bayesian network.
	 * @throws Exception 
	 */
	abstract Network learnStructure(DataSet data) throws Exception;
}