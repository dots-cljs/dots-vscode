(ns dots.vscode.pseudoterminal
  "Defines the interface of a terminal pty, enabling extensions to control a terminal.")

(defn on-did-write
  "An event that when fired will write data to the terminal. Unlike
   {@link Terminal.sendText } which sends text to the underlying child
   pseudo-device (the child), this will write the text to parent pseudo-device (the
   _terminal_ itself).
   
   Note writing `\\n` will just move the cursor down 1 row, you need to write `\\r` as well
   to move the cursor to the left-most cell.
   
   Events fired before {@link Pseudoterminal.open } is called will be be ignored.
   
   **Example:** Write red text to the terminal
   ```typescript
   const writeEmitter = new vscode.EventEmitter<string>();
   const pty: vscode.Pseudoterminal = {
     onDidWrite: writeEmitter.event,
     open: () => writeEmitter.fire('\\x1b[31mHello world\\x1b[0m'),
     close: () => {}
   };
   vscode.window.createTerminal({ name: 'My terminal', pty });
   ```
   
   **Example:** Move the cursor to the 10th row and 20th column and write an asterisk
   ```typescript
   writeEmitter.fire('\\x1b[10;20H*');
   ```
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [pseudoterminal]
   (.-onDidWrite ^js pseudoterminal))
  (^js [pseudoterminal listener]
   (.onDidWrite ^js pseudoterminal listener))
  (^js [pseudoterminal listener this-args]
   (.onDidWrite ^js pseudoterminal listener this-args))
  (^js [pseudoterminal listener this-args disposables]
   (.onDidWrite ^js pseudoterminal listener this-args disposables)))

(defn set-on-did-write!
  "An event that when fired will write data to the terminal. Unlike
   {@link Terminal.sendText } which sends text to the underlying child
   pseudo-device (the child), this will write the text to parent pseudo-device (the
   _terminal_ itself).
   
   Note writing `\\n` will just move the cursor down 1 row, you need to write `\\r` as well
   to move the cursor to the left-most cell.
   
   Events fired before {@link Pseudoterminal.open } is called will be be ignored.
   
   **Example:** Write red text to the terminal
   ```typescript
   const writeEmitter = new vscode.EventEmitter<string>();
   const pty: vscode.Pseudoterminal = {
     onDidWrite: writeEmitter.event,
     open: () => writeEmitter.fire('\\x1b[31mHello world\\x1b[0m'),
     close: () => {}
   };
   vscode.window.createTerminal({ name: 'My terminal', pty });
   ```
   
   **Example:** Move the cursor to the 10th row and 20th column and write an asterisk
   ```typescript
   writeEmitter.fire('\\x1b[10;20H*');
   ```"
  ^js [pseudoterminal value]
  (set! (.-onDidWrite ^js pseudoterminal) value))

(defn on-did-override-dimensions
  "An event that when fired allows overriding the {@link Pseudoterminal.setDimensions dimensions} of the
   terminal. Note that when set, the overridden dimensions will only take effect when they
   are lower than the actual dimensions of the terminal (ie. there will never be a scroll
   bar). Set to `undefined` for the terminal to go back to the regular dimensions (fit to
   the size of the panel).
   
   Events fired before {@link Pseudoterminal.open } is called will be be ignored.
   
   **Example:** Override the dimensions of a terminal to 20 columns and 10 rows
   ```typescript
   const dimensionsEmitter = new vscode.EventEmitter<vscode.TerminalDimensions>();
   const pty: vscode.Pseudoterminal = {
     onDidWrite: writeEmitter.event,
     onDidOverrideDimensions: dimensionsEmitter.event,
     open: () => {
       dimensionsEmitter.fire({
         columns: 20,
         rows: 10
       });
     },
     close: () => {}
   };
   vscode.window.createTerminal({ name: 'My terminal', pty });
   ```
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [pseudoterminal]
   (.-onDidOverrideDimensions ^js pseudoterminal))
  (^js [pseudoterminal listener]
   (.onDidOverrideDimensions ^js pseudoterminal listener))
  (^js [pseudoterminal listener this-args]
   (.onDidOverrideDimensions ^js pseudoterminal listener this-args))
  (^js [pseudoterminal listener this-args disposables]
   (.onDidOverrideDimensions ^js pseudoterminal listener this-args disposables)))

(defn set-on-did-override-dimensions!
  "An event that when fired allows overriding the {@link Pseudoterminal.setDimensions dimensions} of the
   terminal. Note that when set, the overridden dimensions will only take effect when they
   are lower than the actual dimensions of the terminal (ie. there will never be a scroll
   bar). Set to `undefined` for the terminal to go back to the regular dimensions (fit to
   the size of the panel).
   
   Events fired before {@link Pseudoterminal.open } is called will be be ignored.
   
   **Example:** Override the dimensions of a terminal to 20 columns and 10 rows
   ```typescript
   const dimensionsEmitter = new vscode.EventEmitter<vscode.TerminalDimensions>();
   const pty: vscode.Pseudoterminal = {
     onDidWrite: writeEmitter.event,
     onDidOverrideDimensions: dimensionsEmitter.event,
     open: () => {
       dimensionsEmitter.fire({
         columns: 20,
         rows: 10
       });
     },
     close: () => {}
   };
   vscode.window.createTerminal({ name: 'My terminal', pty });
   ```"
  ^js [pseudoterminal value]
  (set! (.-onDidOverrideDimensions ^js pseudoterminal) value))

(defn on-did-close
  "An event that when fired will signal that the pty is closed and dispose of the terminal.
   
   Events fired before {@link Pseudoterminal.open } is called will be be ignored.
   
   A number can be used to provide an exit code for the terminal. Exit codes must be
   positive and a non-zero exit codes signals failure which shows a notification for a
   regular terminal and allows dependent tasks to proceed when used with the
   `CustomExecution` API.
   
   **Example:** Exit the terminal when \"y\" is pressed, otherwise show a notification.
   ```typescript
   const writeEmitter = new vscode.EventEmitter<string>();
   const closeEmitter = new vscode.EventEmitter<void>();
   const pty: vscode.Pseudoterminal = {
     onDidWrite: writeEmitter.event,
     onDidClose: closeEmitter.event,
     open: () => writeEmitter.fire('Press y to exit successfully'),
     close: () => {},
     handleInput: data => {
       if (data !== 'y') {
         vscode.window.showInformationMessage('Something went wrong');
       }
       closeEmitter.fire();
     }
   };
   const terminal = vscode.window.createTerminal({ name: 'Exit example', pty });
   terminal.show(true);
   ```
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [pseudoterminal]
   (.-onDidClose ^js pseudoterminal))
  (^js [pseudoterminal listener]
   (.onDidClose ^js pseudoterminal listener))
  (^js [pseudoterminal listener this-args]
   (.onDidClose ^js pseudoterminal listener this-args))
  (^js [pseudoterminal listener this-args disposables]
   (.onDidClose ^js pseudoterminal listener this-args disposables)))

(defn set-on-did-close!
  "An event that when fired will signal that the pty is closed and dispose of the terminal.
   
   Events fired before {@link Pseudoterminal.open } is called will be be ignored.
   
   A number can be used to provide an exit code for the terminal. Exit codes must be
   positive and a non-zero exit codes signals failure which shows a notification for a
   regular terminal and allows dependent tasks to proceed when used with the
   `CustomExecution` API.
   
   **Example:** Exit the terminal when \"y\" is pressed, otherwise show a notification.
   ```typescript
   const writeEmitter = new vscode.EventEmitter<string>();
   const closeEmitter = new vscode.EventEmitter<void>();
   const pty: vscode.Pseudoterminal = {
     onDidWrite: writeEmitter.event,
     onDidClose: closeEmitter.event,
     open: () => writeEmitter.fire('Press y to exit successfully'),
     close: () => {},
     handleInput: data => {
       if (data !== 'y') {
         vscode.window.showInformationMessage('Something went wrong');
       }
       closeEmitter.fire();
     }
   };
   const terminal = vscode.window.createTerminal({ name: 'Exit example', pty });
   terminal.show(true);
   ```"
  ^js [pseudoterminal value]
  (set! (.-onDidClose ^js pseudoterminal) value))

(defn on-did-change-name
  "An event that when fired allows changing the name of the terminal.
   
   Events fired before {@link Pseudoterminal.open } is called will be be ignored.
   
   **Example:** Change the terminal name to \"My new terminal\".
   ```typescript
   const writeEmitter = new vscode.EventEmitter<string>();
   const changeNameEmitter = new vscode.EventEmitter<string>();
   const pty: vscode.Pseudoterminal = {
     onDidWrite: writeEmitter.event,
     onDidChangeName: changeNameEmitter.event,
     open: () => changeNameEmitter.fire('My new terminal'),
     close: () => {}
   };
   vscode.window.createTerminal({ name: 'My terminal', pty });
   ```
   
   **Parameters:**
   - `listener`: `(e: T) => any` - The listener function will be called when the event happens.
   - `this-args`: `any` - The `this`-argument which will be used when calling the event listener.
   - `disposables`: `Disposable[] | undefined` - An array to which a {@link Disposable } will be added.
   
   **Returns:** `Disposable` - A disposable which unsubscribes the event listener."
  (^js [pseudoterminal]
   (.-onDidChangeName ^js pseudoterminal))
  (^js [pseudoterminal listener]
   (.onDidChangeName ^js pseudoterminal listener))
  (^js [pseudoterminal listener this-args]
   (.onDidChangeName ^js pseudoterminal listener this-args))
  (^js [pseudoterminal listener this-args disposables]
   (.onDidChangeName ^js pseudoterminal listener this-args disposables)))

(defn set-on-did-change-name!
  "An event that when fired allows changing the name of the terminal.
   
   Events fired before {@link Pseudoterminal.open } is called will be be ignored.
   
   **Example:** Change the terminal name to \"My new terminal\".
   ```typescript
   const writeEmitter = new vscode.EventEmitter<string>();
   const changeNameEmitter = new vscode.EventEmitter<string>();
   const pty: vscode.Pseudoterminal = {
     onDidWrite: writeEmitter.event,
     onDidChangeName: changeNameEmitter.event,
     open: () => changeNameEmitter.fire('My new terminal'),
     close: () => {}
   };
   vscode.window.createTerminal({ name: 'My terminal', pty });
   ```"
  ^js [pseudoterminal value]
  (set! (.-onDidChangeName ^js pseudoterminal) value))

(defn open
  "Implement to handle when the pty is open and ready to start firing events.
   
   **Parameters:**
   - `initial-dimensions`: `TerminalDimensions | undefined` - The dimensions of the terminal, this will be undefined if the
   terminal panel has not been opened before this is called.
   
   **Returns:** `void`"
  (^js [pseudoterminal]
   (.open ^js pseudoterminal))
  (^js [pseudoterminal initial-dimensions]
   (.open ^js pseudoterminal initial-dimensions)))

(defn close
  "Implement to handle when the terminal is closed by an act of the user.
   
   **Returns:** `void`"
  ^js [pseudoterminal]
  (.close ^js pseudoterminal))

(defn handle-input
  "Implement to handle incoming keystrokes in the terminal or when an extension calls
   {@link Terminal.sendText }. `data` contains the keystrokes/text serialized into
   their corresponding VT sequence representation.
   
   **Parameters:**
   - `data`: `string` - The incoming data.
   
   **Example:** Echo input in the terminal. The sequence for enter (`\\r`) is translated to
   CRLF to go to a new line and move the cursor to the start of the line.
   ```typescript
   const writeEmitter = new vscode.EventEmitter<string>();
   const pty: vscode.Pseudoterminal = {
   onDidWrite: writeEmitter.event,
   open: () => {},
   close: () => {},
   handleInput: data => writeEmitter.fire(data === '\\r' ? '\\r\\n' : data)
   };
   vscode.window.createTerminal({ name: 'Local echo', pty });
   ```
   
   **Returns:** `void`"
  ^js [pseudoterminal data]
  (.handleInput ^js pseudoterminal data))

(defn set-dimensions
  "Implement to handle when the number of rows and columns that fit into the terminal panel
   changes, for example when font size changes or when the panel is resized. The initial
   state of a terminal's dimensions should be treated as `undefined` until this is triggered
   as the size of a terminal isn't known until it shows up in the user interface.
   
   When dimensions are overridden by
   {@link Pseudoterminal.onDidOverrideDimensions onDidOverrideDimensions}, `setDimensions` will
   continue to be called with the regular panel dimensions, allowing the extension continue
   to react dimension changes.
   
   **Parameters:**
   - `dimensions`: `TerminalDimensions` - The new dimensions.
   
   **Returns:** `void`"
  ^js [pseudoterminal dimensions]
  (.setDimensions ^js pseudoterminal dimensions))
