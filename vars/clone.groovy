def call(String url, String branch){
  echo "this is cloning url.."
  git url:url,branch:branch
  echo "cloning successful"
}

