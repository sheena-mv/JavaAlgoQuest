# Rotate Array

## Description
You are given an integer array `A` of length `N`. A single right rotation shifts each element one index forward; the last element wraps around to the front.

### Example
A = [3, 4, 5, 6, 7], K = 2 ⟶ [6, 7, 3, 4, 5]

## Input Format
- A: integer array
- K: number of rotations

## Output
- Array after K rotations

## Constraints
- K may be greater than N ⇒ reduce via modulo
- Aim for O(N) time, O(1) space

## Approaches
- Reversal method
- Slicing (language-specific)
- Juggling algorithm