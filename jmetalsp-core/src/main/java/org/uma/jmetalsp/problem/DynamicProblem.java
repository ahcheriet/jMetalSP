package org.uma.jmetalsp.problem;

import org.uma.jmetal.problem.Problem;
import org.uma.jmetal.solution.Solution;
import org.uma.jmetalsp.updatedata.UpdateData;
import org.uma.khaos.perception.core.Observer;

/**
 * Created by ajnebro on 18/4/16.
 */
public interface DynamicProblem<S extends Solution<?>, D extends UpdateData>
        extends Problem<S>, Observer<D> {
  boolean hasTheProblemBeenModified() ;
	void reset() ;
}
