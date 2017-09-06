// Import React
import React from "react";

// Import Spectacle Core tags
import {
  BlockQuote,
  Cite,
  Deck,
  Fill,
  Fit,
  Heading,
  Image,
  Layout,
  Link,
  ListItem,
  List,
  Quote,
  Slide,
  Code,
  CodePane,
  Text
} from "spectacle";

import CodeSlide from 'spectacle-code-slide'

// Import image preloader util
import preloader from "spectacle/lib/utils/preloader";

// Import theme
import createTheme from "spectacle-theme-nova/bundle";

import 'spectacle-theme-nova/syntax/prism.nova.css'

//const images = {
  //logo: require('../assets/kotlin_logo.png')
//}

//preloader(images);

const theme = createTheme()

export default class Presentation extends React.Component {
  render() {
    return (
      <Deck
        progress="none"
        theme={theme}
        transition={["fade"]}
        transitionDuration={250}
      >
        <Slide>
          <Heading size={1}>An Adventurer's Guide to Kotlin</Heading>
          <Heading size={3}>Presented by Mark Chandler</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>Why Kotlin?</Heading>
          <List>
            <ListItem>Like Java, but way better</ListItem>
            <ListItem>Write less code; read less code</ListItem>
            <ListItem>Type inference</ListItem>
            <ListItem>Pattern matching</ListItem>
            <ListItem>Null Safety</ListItem>
            <ListItem>No getters/setters</ListItem>
            <ListItem>Destructuring</ListItem>
            <ListItem>Lambdas</ListItem>
            <ListItem>Extensions</ListItem>
          </List>
        </Slide>

        <CodeSlide
          transition={[]}
          lang="kotlin"
          code={require('raw-loader!../assets/code/vars.kt')}
          ranges={[
            { loc: [0, 0], title: "Defining Variables" },
            { loc: [0, 2], note: "var allows re-assignment" },
            { loc: [3, 6], note: "val prevents re-assignment..." },
            { loc: [7, 14], note: "...but isn't immutable" },
            { loc: [15, 18], note: "no 'new' keyword" },
            { loc: [19, 21], note: "type only required when not initializing..." },
            { loc: [22, 24], note: "...or when type is nullable" }
          ]}
          color="white"
          bgColor="#3C4C55"
        />

        <CodeSlide
          transition={[]}
          lang="kotlin"
          code={require('raw-loader!../assets/code/destructuring.kt')}
          ranges={[
            { loc: [0, 0], title: "Destructuring" },
            { loc: [0, 5], note: "destructuring a class" },
            { loc: [0, 8], note: "destructuring compiles down to componentN() functions" },
            { loc: [9, 15], note: "returning multiple values from a function" },
            { loc: [15, 16], note: "use _ for unused variables" },
            { loc: [17, 26], note: "destructuring in a for loop" },
          ]}
          color="white"
          bgColor="#3C4C55"
        />

        <Slide>
          <Heading size={2}>Basic Types</Heading>

          <List>
            <ListItem>Double</ListItem>
            <ListItem>Float</ListItem>
            <ListItem>Long</ListItem>
            <ListItem>Int</ListItem>
            <ListItem>String</ListItem>
            <ListItem>Char</ListItem>
            <ListItem>Boolean</ListItem>
            <ListItem>List</ListItem>
            <ListItem>Array</ListItem>
          </List>
        </Slide>

        <Slide>
          <Heading size={2}>Basic Types</Heading>

          <Heading size={3}>Number Types</Heading>
          <List>
            <ListItem>Double: 123.0</ListItem>
            <ListItem>Float: 123.5f</ListItem>
            <ListItem>Long: 123_000_000L</ListItem>
            <ListItem>Int: 123</ListItem>
          </List>

          <Heading size={3}>Number Conversion</Heading>
          <List>
            <ListItem>toByte()</ListItem>
            <ListItem>toShort()</ListItem>
            <ListItem>toInt()</ListItem>
            <ListItem>toLong()</ListItem>
            <ListItem>toFloat()</ListItem>
            <ListItem>toDouble()</ListItem>
            <ListItem>toChar()</ListItem>
          </List>
        </Slide>

        <CodeSlide
          transition={[]}
          lang="kotlin"
          code={require('raw-loader!../assets/code/nullability.kt')}
          ranges={[
            { loc: [0, 0], title: "Null Safety" },
            { loc: [0, 2], note: "types cannot be null..." },
            { loc: [3, 5], note: "unless nullability is granted using ?" },
            { loc: [6, 7], note: "error if reference might be null without check" },
            { loc: [8, 9], title: "Null Checks", note: "explicit check" },
            { loc: [10, 11], title: "Null Checks", note: "safe call operator" },
            { loc: [12, 19], title: "Null Checks", note: "safe call with let" },
            { loc: [20, 22], title: "Null Checks", note: "value OR with the elvis operator" },
            { loc: [23, 28], title: "Null Checks", note: "control flow using elvis operator" },
            { loc: [29, 30], title: "Null Checks", note: "!! operator" },
            { loc: [31, 32], title: "Null Checks", note: "safe cast operator" },
            { loc: [33, 35], note: "filtering null from collections" }
          ]}
          color="white"
          bgColor="#3C4C55"
        />

        <CodeSlide
          transition={[]}
          lang="kotlin"
          code={require('raw-loader!../assets/code/string_templates.kt')}
          ranges={[
            { loc: [0, 0], title: "String Templates" },
            { loc: [0, 2], note: "reference variables using $" },
            { loc: [3, 7], note: "expressions evaluated using ${}" },
            { loc: [8, 14], note: "multiple values" }
          ]}
          color="white"
          bgColor="#3C4C55"
        />

        <CodeSlide
          transition={[]}
          lang="kotlin"
          code={require('raw-loader!../assets/code/functions.kt')}
          ranges={[
            { loc: [0, 0], title: "Defining Functions" },
            { loc: [0, 3], note: "basic function" },
            { loc: [4, 7], note: "can omit Unit return type" },
            { loc: [8, 11], note: "specifying return type" },
            { loc: [12, 13], note: "single-expression function" },
            { loc: [14, 21], note: "default arguments/name arguments" },
            { loc: [22, 28], note: "variable number of arguments using vararg keyword" }
          ]}
          color="white"
          bgColor="#3C4C55"
        />

        <CodeSlide
          transition={[]}
          lang="kotlin"
          code={require('raw-loader!../assets/code/conditional_expressions.kt')}
          ranges={[
            { loc: [0, 0], title: "Conditionals/Expressions" },
            { loc: [0, 6], note: "if-else" },
            { loc: [7, 9], note: "if as expression" },
            { loc: [10, 17], note: "if as a block; last expression is returned value" }
          ]}
          color="white"
          bgColor="#3C4C55"
        />

        <CodeSlide
          transition={[]}
          lang="kotlin"
          code={require('raw-loader!../assets/code/when.kt')}
          ranges={[
            { loc: [0, 0], title: "When Expression" },
            { loc: [0, 8], note: "operates similar to traditional 'switch' statement (break not required)" },
            { loc: [9, 13], note: "combine cases with ," },
            { loc: [14, 18], note: "use 'in' keyword to test ranges of numbers" },
            { loc: [19, 25], note: "can also use 'in' keyword to test if contained in a collection" },
            { loc: [26, 30], note: "smart casting" },
            { loc: [31, 36], note: "without an argument, when works as a conditional statement" }
          ]}
          color="white"
          bgColor="#3C4C55"
        />

        <CodeSlide
          transition={[]}
          lang="kotlin"
          code={require('raw-loader!../assets/code/loops.kt')}
          ranges={[
            { loc: [0, 0], title: "Loops" },
            { loc: [0, 1], title: "For Loop", note: "loop through anything providing an iterator" },
            { loc: [2, 5], title: "For Loop", note: "loop using index" },
            { loc: [6, 9], title: "For Loop", note: "loop using both index and values" },
            { loc: [10, 13], title: "While", note: "just like while everywhere else" },
            { loc: [14, 17], title: "While", note: "do-while; do expression is executed at least once" },
          ]}
          color="white"
          bgColor="#3C4C55"
        />

        <Slide>
          <Heading size={3}>Classes</Heading>
          <List>
            <ListItem>Constructor Types</ListItem>
            <ListItem>init Block</ListItem>
            <ListItem>Properties</ListItem>
            <ListItem>getters/setters</ListItem>
            <ListItem>Functions</ListItem>
          </List>
        </Slide>

        <CodeSlide
          transition={[]}
          lang="kotlin"
          code={require('raw-loader!../assets/code/classes.kt')}
          ranges={[
            { loc: [0, 0], title: "Classes" },
            { loc: [0, 2], note: "basic definition" },
            { loc: [3, 4], note: "with primary constructor" },
            { loc: [5, 6], note: "with omitted constructor keyword" },
            { loc: [7, 19], note: "with init block" },
            { loc: [20, 25], note: "with property (comes with getter and/or setter)" },
            { loc: [26, 48], note: "with constructor property shorthand" },
            { loc: [49, 55], note: "default property values/named arguments/changing property visibility" },
            { loc: [56, 61], note: "custom getters and setters for class properties" },
            { loc: [62, 64], note: "changing getter/setter visibility" },
            { loc: [65, 69], note: "classes cannot have fields, but have access to backing fields" },
            { loc: [70, 78], note: "backing properties available for other use cases" },
            { loc: [79, 89], note: "with lateinit property" },
            { loc: [90, 100], note: "Spring lateinit example" },
            { loc: [100, 110], note: "secondary constructor must delegate to primary constructor if present" },
            { loc: [111, 118], note: "defining functions on a class" }
          ]}
          color="white"
          bgColor="#3C4C55"
        />

        <Slide>
          <Heading size={3}>Data Classes</Heading>
          <Text>Perfect for classes that do nothing but hold data</Text>
          <Text>Things data classes give us out of the box:</Text>
          <List>
            <ListItem>equals()/hashCode()</ListItem>
            <ListItem>toString()</ListItem>
            <ListItem>componentN() functions for properties</ListItem>
            <ListItem>copy()</ListItem>
          </List>
        </Slide>

        <CodeSlide
          transition={[]}
          lang="kotlin"
          code={require('raw-loader!../assets/code/data_classes.kt')}
          ranges={[
            { loc: [0, 0], title: "Data Classes" },
            { loc: [0, 1], note: "basic data class" },
            { loc: [2, 5], note: "instantiating data classes" },
            { loc: [6, 9], note: "toString() on non-data class (UGLY)" },
            { loc: [10, 11], note: "toString() on data class (PRETTIFIED)" },
            { loc: [12, 14], note: "componentN() functions" },
            { loc: [15, 17], note: "destructuring properties" },
            { loc: [18, 22], note: "equals()" },
            { loc: [23, 25], note: "copy()" }
          ]}
          color="white"
          bgColor="#3C4C55"
        />

        <CodeSlide
          transition={[]}
          lang="kotlin"
          code={require('raw-loader!../assets/code/enum_classes.kt')}
          ranges={[
            { loc: [0, 0], title: "Enum Classes" },
            { loc: [0, 4], note: "basic enum" },
            { loc: [5, 14], note: "enum classes can be initialized" },
            { loc: [15, 28], note: "enum constants can be used as anonymous classes" },
          ]}
          color="white"
          bgColor="#3C4C55"
        />

        <CodeSlide
          transition={[]}
          lang="kotlin"
          code={require('raw-loader!../assets/code/interfaces.kt')}
          ranges={[
            { loc: [0, 0], title: "Interfaces" },
            { loc: [0, 4], note: "basic interface" },
            { loc: [0, 10], note: "implementing the interface" },
            { loc: [11, 35], note: "overriding multiple interfaces" },
          ]}
          color="white"
          bgColor="#3C4C55"
        />

        <CodeSlide
          transition={[]}
          lang="kotlin"
          code={require('raw-loader!../assets/code/objects.kt')}
          ranges={[
            { loc: [0, 0], title: "Objects" },
            { loc: [0, 4], note: "can hold properties" },
            { loc: [5, 14], note: "object expressions -- anonymous class that inherits from some type" },
            { loc: [15, 29], note: "can access enclosing scope" },
            { loc: [30, 39], note: "singleton" },
            { loc: [40, 46], title: "Companion Object", note: "basic definition" },
            { loc: [47, 56], title: "Companion Object", note: "look like static members but are instance members of real objects--can implement interfaces" }
          ]}
          color="white"
          bgColor="#3C4C55"
        />

        <CodeSlide
          transition={[]}
          lang="kotlin"
          code={require('raw-loader!../assets/code/lambdas.kt')}
          ranges={[
            { loc: [0, 0], title: "Lambdas" },
            { loc: [0, 9], note: "higher order functions--a function that takes in functions or returns a function (see callable reference)" },
            { loc: [10, 13], note: "basic lambda/anonymous function" },
            { loc: [14, 15], note: "type can be defined outside lambda" },
            { loc: [16, 17], note: "use 'it' for single-parameter lambdas" },
            { loc: [18, 26], note: "lambdas return like expressions" },
            { loc: [27, 29], note: "lambdas can be used outside of function call parens if lambda is last parameter" },
            { loc: [30, 35], note: "lambdas can access closure" }
          ]}
          color="white"
          bgColor="#3C4C55"
        />

        <CodeSlide
          transition={[]}
          lang="kotlin"
          code={require('raw-loader!../assets/code/extensions.kt')}
          ranges={[
            { loc: [0, 0], title: "Extensions" },
            { loc: [0, 8], note: "prefix function name with receiver type" },
            { loc: [9, 14], note: "add function to all String types" },
          ]}
          color="white"
          bgColor="#3C4C55"
        />

        <Slide>
          <Heading size={1}>Thank You!</Heading>
          <List>
            <ListItem>Get Kotlin: https://kotlinlang.org/</ListItem>
            <ListItem>Try Kotlin in your browser: https://try.kotlinlang.org/</ListItem>
            <ListItem>Kotlin Forum: https://discuss.kotlinlang.org/</ListItem>
          </List>
        </Slide>
      </Deck>
    );
  }
}
