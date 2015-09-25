/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Statistics.NodeStats;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kostas
 */
public class Node {

    int nodeID;
    Configuration _config;
    String _nodeName;
    
    List<VM> _activeVMs;    // A list with VMs per Node Machine;
    List<VM> _closedVMs;    // A list with VMs per Node Machine;
    
    NodeStats _hostStats;
    
    int[] neighborIDs;
    int[] neighborEdgeWeights;
    
    public Node(Configuration config,String nodeName) {
        
        this._config=config;
        this._nodeName=nodeName;
        
        this._activeVMs=new ArrayList<>();     // A list with VMs per Node Machine;
        this._closedVMs=new ArrayList<>();
        this._hostStats=new NodeStats();
    }

    public String getNodeName() {
        return _nodeName;
    }

    
}
