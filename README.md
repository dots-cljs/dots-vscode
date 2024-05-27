# dots-vscode

[![cljdoc](https://cljdoc.org/badge/io.github.dots-cljs/dots-vscode)][cljdoc]
[![Clojars](https://img.shields.io/clojars/v/io.github.dots-cljs/dots-vscode.svg)][clojars]

ClojureScript wrapper for the [VS-Code API][vscode-api].
Built from [`@types/vscode`][types-vscode] with [dots].

[dots]: https://github.com/ferdinand-beyer/dots
[clojars]: https://clojars.org/io.github.dots-cljs/dots-vscode
[cljdoc]: https://cljdoc.org/jump/release/io.github.dots-cljs/dots-vscode
[types-vscode]: https://www.npmjs.com/package/@types/vscode
[vscode-api]: https://code.visualstudio.com/api/references/vscode-api

## Installation

Distributed via [Clojars][clojars].

Add this to your `deps.edn`:

```clojure
io.github.dots-cljs/dots-vscode {:mvn/version "1.89.0-6"}
```

Or this to your `shadow-cljs.edn`:

```clojure
[io.github.dots-cljs/dots-vscode "1.89.0-6"]
```

We use the versioning scheme `UPSTREAM-COMMITS`:
- `UPSTREAM` is the version of the JavaScript API we wrap (see [`package.json`](package.json)).
- `COMMITS` is the number of commits in this repository at the time of release.

## API

See [cljdoc].

## License

Distributed under the [MIT License].  
Copyright &copy; 2024 [Ferdinand Beyer]

[Ferdinand Beyer]: https://fbeyer.com
[MIT License]: https://opensource.org/licenses/MIT
