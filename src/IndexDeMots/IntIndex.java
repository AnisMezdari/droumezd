/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IndexDeMots;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Antoine
 */
public interface IntIndex {
    
    /**
     *
     * @param k
     * @param line
     * @return
     */
    public boolean ajoutMot(String k, int line);

    /**
     *
     * @param k
     * @param line
     * @return
     */
    public boolean delete(String k, int line);

    /**
     *
     * @param k
     * @return
     */
    public boolean delete(String k);

    /**
     *
     * @return
     */
    public Map<String, List<Integer>> getIndex();

    /**
     *
     * @param k
     * @return
     */
    public List<Integer> rechercher(String k);
    
}
