; Solution to problem set #2

;----------------------------------------------------------
; Problem 1

; Recursive solution
(defn ! [n]
  (if (zero? n)
    1
    (*' n (! (dec n)))))

; loop/recur solution
(defn ! [n]
  (loop [i 1
         result 1]
    (if (> i n)
      result
      (recur (inc i) (*' result i)))))

; Clojure sequence API solution
(defn ! [n]
  (reduce *' (range 1 (inc n))))

;----------------------------------------------------------
; Problem 2

; Recursive solution
(defn duplicate
  [lst]
  (if (empty? lst)
    ()
    (cons (first lst)
          (cons (first lst)
                (duplicate (rest lst))))))

; Clojure sequence API solution
(defn duplicate
  [lst]
  (interleave lst lst))

;----------------------------------------------------------
; Problem 3

; Clojure sequence API solution
(defn positives
  [lst]
  (filter pos? lst))

;----------------------------------------------------------
; Problem 4

; Recursive solution
(defn enlist
  [lst]
  (if (empty? lst)
    ()
    (cons (cons (first lst) ())
          (enlist (rest lst)))))

; Clojure sequence API solution
(defn enlist
  [lst]
  (map list lst))