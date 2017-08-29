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
  Text
} from "spectacle";

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
            <ListItem>Like Java, but better</ListItem>
            <ListItem>Write less code; read less code</ListItem>
            <ListItem>Type inference</ListItem>
            <ListItem>Pattern matching</ListItem>
            <ListItem>Nullability</ListItem>
            <ListItem>No getters/setters</ListItem>
            <ListItem>Destructuring</ListItem>
            <ListItem>Lambdas</ListItem>
            <ListItem>Extensions</ListItem>
          </List>
        </Slide>

        <Slide>
          <Heading size={2}>Defining Variables</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>Nullability</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>Defining Functions</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>Basic Types</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>String Templates</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>Conditional Expressions</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>Returns and Jumps</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>Type Checking</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>For</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>While/Do-While</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>Ranges</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>When Expression</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>Classes</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>Data Classes</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>Interfaces</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>Object</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>Visibility Modifiers</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>Extensions</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>Sealed Classes</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>Enum Classes</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>Higher Order Function</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>Lambda</Heading>
        </Slide>

        <Slide>
          <Heading size={2}>Co-routines</Heading>
        </Slide>
      </Deck>
    );
  }
}
