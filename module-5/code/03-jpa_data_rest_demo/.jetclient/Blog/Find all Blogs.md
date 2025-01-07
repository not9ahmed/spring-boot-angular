```toml
name = 'Find all Blogs'
method = 'GET'
url = 'http://localhost:8080/blogs?size=1'
sortWeight = 2000000
id = '405f0bb8-4870-4bfa-aa9b-7b9d8a8dd2f3'

[[queryParams]]
key = 'size'
value = '1'

[body]
type = 'JSON'
raw = '''
{
  title: "First blog title",
  content: "First blog content",
}'''
```
