; Solution to problem set #3

;----------------------------------------------------------
; Problem 1

; Recursive solution
(defn fib
  [n]
  (if (<= n 1)
    n
    (+ (fib (- n 1))
       (fib (- n 2)))))

; loop/recur solution
(defn fib
  [n]
  (loop [a 0
         b 1
         i 0]
    (if (= i n)
      a
      (recur b (+' a b) (inc i)))))

; Clojure sequence API solution
(defn fib
  [n]
  (first (first (drop n
                      (iterate (fn [[a b]]
                                 [b (+' a b)]) 
                               [0 1])))))

;----------------------------------------------------------
; Problem 2

(defn invert-pairs
  [s]
  (map (fn [[x y]] [y x]) s))

;----------------------------------------------------------
; Problem 3

(defn binary
  [n]
  (second
   (first
    (drop-while (fn [[n _]]
                  (not (zero? n)))
                (iterate (fn [[n result]]
                           [(quot n 2) (cons (rem n 2) result)])
                         [n ()])))))
