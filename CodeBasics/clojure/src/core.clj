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

; Case + cond + if combo

(defn do-today
  [weekday]
  (if (int? weekday)
    (cond
      (and (>= weekday 1) (<= weekday 5)) "work"
      (case weekday
        (6 7) true
        false) "rest"
      :else "???")
      "???"))

(defn -main []
  (println "(-main invoked)"))



(comment
  (do-today 1)
  (do-today 0)
  (do-today -1)
  (do-today 10)
  (do-today false)
  (do-today "test")
  (do-today 6)

  (leap-year? 2012) ; true
  (leap-year? 1913) ; false
  (leap-year? 1804) ; true
  (leap-year? 2100) ; false
  (println "test")
  (= nil true)
  (= (list '(:a :b :c)) '(:a :b :c)))
