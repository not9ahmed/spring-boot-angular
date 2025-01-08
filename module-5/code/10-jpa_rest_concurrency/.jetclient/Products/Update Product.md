```toml
name = 'Update Product'
method = 'PUT'
url = 'http://localhost:8080/products/3'
sortWeight = 4000000
id = 'a940bfcf-ffcc-4413-a053-068d1bb7f2ad'

[body]
type = 'JSON'
raw = '''
{
  "title": "iPhone 16 new updated",
  "category": "Smartphone",
  "price": 9999.0,
  "version": 4
}'''
```
