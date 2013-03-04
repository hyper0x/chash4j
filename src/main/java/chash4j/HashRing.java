package chash4j;

import java.util.Set;

public interface HashRing {

    void build(short shadowNumber) throws CHashException;
    void destroy() throws CHashException;
    HashRingStatus status();
    void check(NodeCheckMethod nodeCheckMethod) throws CHashException;
    boolean startCheck(NodeCheckMethod nodeCheckMethod, short intervalSeconds) throws CHashException;
    boolean stopCheck() throws CHashException;
    boolean inChecking();
    boolean addTarget(String target) throws CHashException;
    boolean removeTarget(String target) throws CHashException;
    String getTarget(String key) throws CHashException;
    Set<String> getTargets(String key, int number) throws CHashException;

}
