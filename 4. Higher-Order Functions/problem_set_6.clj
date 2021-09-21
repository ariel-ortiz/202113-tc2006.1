; Solution to problem set #6

;----------------------------------------------------------
; Problem 1

(defn argswap
  [f]
  (fn [x y]
    (f y x)))

;----------------------------------------------------------
; Problem 2

(defn there-exists-one
  [pred lst]
  (= 1 (count (filter pred lst))))

;----------------------------------------------------------
; Problem 3

(defn linear-search
  [vct x eq-fun]
  (loop [i 0]
    (cond
      (= i (count vct))   nil
      (eq-fun (vct i) x)  i
      :else               (recur (inc i)))))
