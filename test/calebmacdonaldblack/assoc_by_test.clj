(ns calebmacdonaldblack.assoc-by-test
  (:require [clojure.test :refer :all])
  (:require [calebmacdonaldblack.assoc-by :refer [assoc-by]]))

(deftest assoc-by-test
  (is (= {1 {:id 1 :label "A"}
          2 {:id 2 :label "B"}}
         (assoc-by
           :id [{:id 1 :label "A"}
                {:id 2 :label "B"}]))))
