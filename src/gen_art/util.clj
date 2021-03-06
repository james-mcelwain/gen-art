(ns gen-art.util
  (:require [quil.core :as q]))

(defn print-state [state]
  (q/text-size 20)
  (q/text (str state) 20 20))

(defmacro rmap [& ks]
  `(let [keys# (quote ~ks)
         keys# (map keyword keys#)
         vals# (list ~@ks)]
     (zipmap keys# vals#)))
