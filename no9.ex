defmodule Solution do
  @spec is_palindrome(x :: integer) :: boolean
  def is_palindrome(x) do
    
    ans = nil

   if to_char_list(x) != to_char_list(String.reverse(Integer.to_string(x))) do ans = false else ans = true end


  end
end