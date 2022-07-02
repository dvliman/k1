(ns k1.core
  (:require [xtdb.api :as xt]))

;; TODO: learn about xtdb
(def node (xt/start-node {}))

(def manifest
  {:xt/id :manifest
   :pilot-name "Johanna"
   :id/rocket "SB002-sol"
   :id/employee "22910x2"
   :badges "SETUP"
   :cargo ["stereo" "gold fish" "slippers" "secret note"]})

(xt/submit-tx node [[::xt/put manifest]])

(xt/sync node)

(xt/entity (xt/db node) :manifest)

;; https://kennytilton.github.io/whoishiring/
;; filters: remote, onsite (location), interns (job type), visa (immigration)
;; filters: starred, noted, applied, excluded, unreviewed (personal application)
;; sort: creation, stars, company
;; search: title only, full listing
;; role: full-stack | backend |
;; edition: june 2022
;; headquarter, job position, remote
;;
;; launch yc
