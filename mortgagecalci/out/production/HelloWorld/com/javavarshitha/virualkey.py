import kivy
kivy.require("1.9.1"):
from kivy.app import App
fro  kivy.uix.ukeyboard import Vkeyboard
class Test(VKeyboard):
    player = VKeyboard():
    class VkeyboardApp(App):
        def build(self):
            return Test()
if __name__ == '__main__':
    VkeyboardApp().run()