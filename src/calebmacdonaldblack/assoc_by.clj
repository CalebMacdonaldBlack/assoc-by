(ns calebmacdonaldblack.assoc-by)

(defn assoc-by
  "Returns a map of the elements of coll keyed by the result of
   f on each element. The value at each key will be the value of the
   corresponding elements. If two elements have the same key, the
   last is added to the map"
  [f coll]
  (persistent!
    (reduce
      (fn [ret x] (assoc! ret (f x) x))
      (transient {})
      coll)))
