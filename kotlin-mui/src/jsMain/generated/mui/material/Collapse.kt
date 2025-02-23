// Automatically generated - do not modify!

@file:JsModule("@mui/material/Collapse")
@file:JsNonModule

package mui.material

import csstype.ClassName
import mui.material.styles.Theme
import mui.system.SxProps

external interface CollapseProps :
    mui.system.StandardProps,
    mui.material.transitions.TransitionProps,
    react.PropsWithChildren,
    react.PropsWithClassName,
    mui.system.PropsWithSx {
    /**
     * The content node to be collapsed.
     */
    override var children: react.ReactNode?

    override var className: ClassName?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: CollapseClasses?

    /**
     * The width (horizontal) or height (vertical) of the container when collapsed.
     * @default '0px'
     */
    var collapsedSize: dynamic

    /**
     * The component used for the root node.
     * Either a string to use a HTML element or a component.
     */
    var component: react.ElementType<mui.material.transitions.TransitionProps>?

    /**
     * The transition timing function.
     * You may specify a single easing or a object containing enter and exit values.
     */
    var easing: dynamic /* TransitionProps['easing'] */

    /**
     * If `true`, the component will transition in.
     */
    var `in`: Boolean?

    /**
     * The transition orientation.
     * @default 'vertical'
     */
    var orientation: Orientation?

    /**
     * The duration for the transition, in milliseconds.
     * You may specify a single timeout for all transitions, or individually with an object.
     *
     * Set to 'auto' to automatically calculate transition time based on height.
     * @default duration.standard
     */
    var timeout: dynamic /* TransitionProps['timeout'] | 'auto' */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 * The Collapse transition is used by the
 * [Vertical Stepper](https://mui.com/material-ui/react-stepper/#vertical-stepper) StepContent component.
 * It uses [react-transition-group](https://github.com/reactjs/react-transition-group) internally.
 *
 * Demos:
 *
 * - [Card](https://mui.com/material-ui/react-card/)
 * - [Lists](https://mui.com/material-ui/react-list/)
 * - [Transitions](https://mui.com/material-ui/transitions/)
 *
 * API:
 *
 * - [Collapse API](https://mui.com/material-ui/api/collapse/)
 * - inherits [Transition API](http://reactcommunity.org/react-transition-group/transition/#Transition-props)
 */

@JsName("default")
external val Collapse: react.FC<CollapseProps>
