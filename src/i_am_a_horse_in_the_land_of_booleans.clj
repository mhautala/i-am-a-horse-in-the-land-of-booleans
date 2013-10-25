(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (not (or (= x nil) (= x false))))

(defn abs [x]
  (if (< x 0)
    (* -1 x)
    x ))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else ""
   ))


(defn teen? [age]
  (and (> age 12) (< age 20)))

(defn not-teen? [age]
  (not (teen? age)))

; Write a function (generic-doublificate x) that takes one argument and

; doubles it if it is a number,
; returns nil if it is an empty collection,
; if it is a list or a vector, returns two times the length of it
; returns true otherwise.

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true
  ))

(defn leap-year? [year]
  (cond
   (divides? 400 year) true
   (and (divides? 4 year) (not (divides? 100 year))) true
   :else false ))

; '_______'

