package com.example.springpetclinic.services.map;

import javax.persistence.Id;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapservice <T,ID>{
    protected Map<Long,T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save( T t){
        Long id = 1L;
        if(map != null) {
            id = new Long(map.size()) + 1;
        }
        map.put(id,t);
        return t;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T t){
        map.entrySet().removeIf(entry -> entry.getValue().equals(t));
    }
}
