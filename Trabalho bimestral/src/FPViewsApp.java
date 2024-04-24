public class FPViewsApp {
    public static void main(String[] args) {
        VideoPlayerController videoPlayer = new VideoPlayerController();
        PremiumOption premiumOption = new PremiumOption();
        OfflineMode offlineMode = new OfflineMode();

        videoPlayer.playVideo(video);
        premiumOption.removeAds();
        premiumOption.downloadVideoWithoutWatermark(video);
        offlineMode.viewOffline(video);
    }
}
