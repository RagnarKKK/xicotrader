(ns xicotrader.loader
  (:require
    [cemerick.pomegranate :as p]
    [xicotrader.strategy :as strategy]))

(defn load-strategy [config system-map strategy-jar]
  (p/add-classpath strategy-jar)
  (require '[xicotrader.strategy.impl])
  (eval '(xicotrader.strategy.impl/new {})))

(defn load-service [config system-map strategy-key]
  ;; todo
  )
