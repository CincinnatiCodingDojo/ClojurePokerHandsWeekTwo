(ns PokerHands.core_test
  (:use clojure.test
        PokerHands.core))

(deftest name-this-test
        (is (= true true)))

(deftest is-valid-card
	(is (= false (buildCard "")))
	(is (= true (buildCard "2D")))
	(is (= false (buildCard "XYZ")))
)

(deftest is-valid-rank
	(is (= false (isValidRank "")))
	(is (= true (isValidRank "2")))
	(is (= true (isValidRank "3")))
	(is (= true (isValidRank "4")))
	(is (= true (isValidRank "5")))
	(is (= true (isValidRank "6")))
	(is (= true (isValidRank "7")))
	(is (= true (isValidRank "8")))
	(is (= true (isValidRank "9")))
	(is (= true (isValidRank "T")))
	(is (= true (isValidRank "J")))
	(is (= true (isValidRank "Q")))
	(is (= true (isValidRank "K")))
	(is (= true (isValidRank "A")))
	(is (= false (isValidRank "G")))
)

(deftest is-valid-suit
	(is (= false (isValidSuit "")))
	(is (= true (isValidSuit "D")))
)

(deftest build-card-with-rank-and-suit
	(is (= nil (buildCardWithRankAndSuit :2 :D)))

)