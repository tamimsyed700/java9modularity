package javamodularity.easytext.gui;

import javamodularity.easytext.analysis.FleschKincaid;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
public class Main
{
    public Main(){
        JFrame frame= new JFrame();
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("FleschKincaid");
        JList<String> list = new JList<>(listModel);
        list.setBounds(100,100, 75,75);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(new JLabel("Select the Algorithm:"));
        frame.add(list);
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(e -> {

        });
    }




    public static void main(String[] args) {
        new Main();
    }

    private String analyze(String input, String algorithm) {
        List<List<String>> sentences = toSentences(input);

        return "Flesch-Kincaid: " + new FleschKincaid().analyze(sentences);
    }


   public static List<List<String>> toSentences(String text) {
      String removedBreaks = text.replaceAll("\\r?\\n", " ");
      ArrayList<List<String>> sentences = new ArrayList<>();
      for(String rawSentence: removedBreaks.split("[\\.\\?\\!]")) {
         List<String> words = toWords(rawSentence);
         if(words.size() > 0) {
            sentences.add(words);
         }
      }

      return sentences;
   }

   public static List<String> toWords(String sentence) {
      String[] rawWords = sentence.split("\\s+");
      List<String> words = new ArrayList<>();
      for(String rawWord: rawWords) {
         String word = rawWord.replaceAll("\\W", "");
         if(word.length() > 0) {
            words.add(word);
         }
      }

      return words;
   }
}
