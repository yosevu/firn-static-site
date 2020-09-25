(defn head
  [site-url body]
  (let [resource #(str site-url "/static/" %)]
    [:html
     [:head
      [:meta {:charset "UTF-8"}]
      [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]
      [:link {:rel "stylesheet" :href (resource "css/firn_base.css")}]
      [:link {:rel "stylesheet" :href (resource "css/a11y-dark.css")}]
      [:script {:src (resource "js/highlight.pack.js")}]
      [:script "hljs.initHighlightingOnLoad()"]]
     body]))
