(ns core
  (:require [clojure.string :refer [upper-case]]))

(defn leap-year?
  [x]
  (and
   (= (rem x 4) 0)
   (or
    (= (rem x 100) 0)
    (= (rem x 400) 0))))

;if-else
(defn sentence-type
  [sentence]
  (if (= sentence (upper-case sentence)) "cry" "common"))
; when
(defn say-boom
  [param]
  (when (= param "go") "Boom!"))

;case
(defn humanize-permission
  [sym]
  (case sym
    "x" "execute"
    "r" "read"
    "w" "write"))

; Condition

(defn programmer-level
  [level]
  (cond
    (<= level 10) "junior"
    (<= level 20) "middle"
    (> level 20) "senior"))

(defn do-today
  [weekday])

(defn -main []
  (println "(-main invoked)"))

(comment
  (leap-year? 2012) ; true
  (leap-year? 1913) ; false
  (leap-year? 1804) ; true
  (leap-year? 2100) ; false
  (println "test")
  (= nil true)
  (= (list '(:a :b :c)) '(:a :b :c)))
