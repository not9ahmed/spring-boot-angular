```toml
name = 'Find Blog by ID'
method = 'GET'
url = 'http://localhost:8080/blogs/2'
sortWeight = 4000000
id = 'f53520df-71fa-45a2-919b-5a6948e6cd43'

[body]
type = 'JSON'
raw = '''
{
  title: "First blog title",
  content: "First blog content",
}'''
```
