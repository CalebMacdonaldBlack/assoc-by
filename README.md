# associate-by
Returns a map of the elements of _coll_ keyed by the result of _f_ on each element. The value at each key will be the value of the corresponding elements. If two elements have the same key, the last is added to the map.

```clojure
(assoc-by
  :id [{:id 1 :label "A"}
       {:id 2 :label "B"}])
       
=> {1 {:id 1, :label "A"}, 2 {:id 2, :label "B"}}
```
