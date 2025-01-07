```toml
name = 'Create Blog'
method = 'POST'
url = 'http://localhost:8080/blogs'
sortWeight = 1000000
id = '53f27d4c-19a7-45b9-b48a-5c8cae7c6a9a'

[body]
type = 'JSON'
raw = '''
{
  title: "Second blog title",
  content: "Second blog content",
}'''
```
